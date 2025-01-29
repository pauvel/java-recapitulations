import java.util.Objects;

class Dog {
    private String name;

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if( o instanceof Dog){
            System.out.println("It's an instanceof Dog");
            Dog comparedDog = (Dog)o;
            if(comparedDog.getName().equals(this.name)){
                System.out.println("They got the same name!!");
                return true;
            }
        }
        return false;
    }

}



public class OperatorVsEquals {
    public static void main(String[] args) {

        Dog terry = new Dog("Terry");
        Dog vayron = new Dog("Terry");

        if(terry == vayron){
            // this would be false because they are pointing to different references.
            System.out.println("TERRY AND VAYRON = true");
        }else{
            System.out.println("TERRY AND VAYRON = false");
        }


        if(terry.equals(vayron)){
            System.out.println("TERRY Equals VAYRON = true");
        }else{
            System.out.println("TERRY Equals VAYRON = false");
        }






    }
}
