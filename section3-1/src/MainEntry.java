import humans.Employee;
import humans.ExampleProtected;
import humans.Student;

public class MainEntry  extends ExampleProtected {
     void executeFooProtected(){
        foo();
    }
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


        // TODO: Protected modifier sample.
//        ExampleProtected exampleProtected = new ExampleProtected();
//        exampleProtected.ex
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=--=--");
        MainEntry mainEntry = new MainEntry();
        mainEntry.foo();
        mainEntry.executeFooProtected();

    }
}
