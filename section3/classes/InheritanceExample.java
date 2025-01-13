

public class InheritanceExample {

    public static void main(String[] args) {
        Animal animal = new Animal("NO_NAME");
        Dog dog = new Dog();
        Cat cat = new Cat();
//        System.out.println(cat instanceof Dog);
//        Aunque las clases Cat y Dog comparten la misma clase base (Animal), el operador instanceof verifica si el tipo de un objeto puede convertirse al tipo especificado. Si el compilador determina en tiempo de compilación que no hay una posible relación (ni directa ni indirecta) entre los tipos, genera un error.

        System.out.println(animal instanceof Animal);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);

        System.out.println(animal instanceof Object);
        // System.out.println(dog instanceof Cat);

        System.out.println(dog instanceof Object);

    }

}
