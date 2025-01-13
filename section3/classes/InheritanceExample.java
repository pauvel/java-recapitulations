

public class InheritanceExample {

    public static void main(String[] args) {
        Animal animal = new Animal("NO_NAME");
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(animal instanceof Animal);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);

        System.out.println(animal instanceof Object);
        // System.out.println(dog instanceof Cat);

        System.out.println(dog instanceof Object);

    }

}
