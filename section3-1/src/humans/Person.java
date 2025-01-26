package humans;

public class Person {

    {
        System.out.println("Executed anonymous block.");
        numberOfPersons++;
    }

    private final String personName;
    private final int age;

    public static int numberOfPersons;

    public Person(String personName, int age){
        this.personName = personName;
        this.age = age;
//        numberOfPersons++;
    }

    public int numberOfPersons(){
        return numberOfPersons;
    }

    public void eat(){
        System.out.println(this.personName + " is eating");
    }

    public void sleep(){
        System.out.println(this.personName + " is sleeping");
    }

    public String getPersonName(){
        return this.personName;
    }

    public final void breathe(){
        System.out.println(this.personName + " is breathing");
    }

}
