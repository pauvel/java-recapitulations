package humans;

public class Person {

    private final String personName;
    private final int age;

    Person(String personName, int age){
        this.personName = personName;
        this.age = age;
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

}
