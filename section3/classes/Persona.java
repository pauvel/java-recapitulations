// package section3.classes;

public class Persona {

    // Attributes.
    public String nombre;
    public short edad;
    public char genero;

    // Constructor.
    Persona(){
        this("Roblox", (short)80, 'm');
        System.out.println("Persona Initialized.");
    }

    Persona(String n, short e, char g){
        // Invoke Constructor.
//        this();
        System.out.println("Persona with 3 args Initialized.");
        this.nombre = n;
        this.edad = e;
        this.genero = g;
    }

    // Methods.

    public void imprimirInfo(){
        // Using this
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Genero: "+ this.genero);
        System.out.println("Edad: "+ this.edad);
    }

    void jugarVideojuegos(Persona p){
        System.out.println(this.nombre + " Esta jugando con: "+ p.nombre);
    }


}