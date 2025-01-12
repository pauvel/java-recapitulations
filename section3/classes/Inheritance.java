class Animal {
    private final String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("The " + this.name + " is eating");
    }
}

class Dog extends Animal {
    Dog(){
        super("Dog");
    }
}

class Cat extends Animal {
    Cat(){
        super("Cat");
    }
}



public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance class loaded.");
        Dog peluchin = new Dog();
        peluchin.eat();

        Cat pelusa = new Cat();
        pelusa.eat();
    }
}