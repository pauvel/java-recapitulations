package humans;

public class Employee extends Person{
    private String companyName;
    private float salary;

    public Employee(String companyName, float salary, String personName, int age) {
        super(personName, age);
        this.companyName = companyName;
        this.salary = salary;
    }

    public void work(){
        System.out.println(super.getPersonName() + " is working.");
    }

    @Override
    public void sleep(){
        System.out.println(super.getPersonName() + " have work, so can't sleep.");
    }

}
