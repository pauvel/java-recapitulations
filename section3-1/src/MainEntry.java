import humans.Employee;
import humans.Student;

public class MainEntry {
    public static void main(String[] args) {
//        System.out.println("MainEntry class loaded!");

        Student paul = new Student("Paul", 29);
        paul.isApproved();
        paul.eat();
        paul.sleep();

        Employee ricky = new Employee("Microsoft", 12500, "Ricky", 32);
        ricky.sleep();
        ricky.eat();
        ricky.work();

    }
}
