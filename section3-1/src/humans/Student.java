package humans;

public class Student extends Person{

    private String university;
    private int enrollmentNumber;

    public Student(String name, int age) {
        super(name, age);
        this.university = "UDG";
        this.enrollmentNumber = 1800092;
    }

    public void isApproved(){
//        super.eat();
        System.out.println( super.getPersonName() + " is approved");
    }
}
