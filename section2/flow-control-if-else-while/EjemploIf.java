class EjemploIf {

    public static void main(String args[]){
        ifCondition();
        ifElseIfCondition();

    }

    static void whileCondition(){

    }

    private static void ifCondition(){
        int age = 18;
        if(age >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    private static void ifElseIfCondition(){
        int age = 17;

        boolean isAdult = age>=18;

        if(isAdult){
            System.out.println("Can go throught.");
        }else if(age<=15){
            System.out.println("Report and Can't go throught.");
        }else{
            System.out.println("Can't go throught.");
        }
    }

}