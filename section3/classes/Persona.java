// package section3.classes;

public class Persona {

    // Attributes.
    public String nombre;
    public short edad;
    public char genero;

    // Methods.

    public void imprimirInfo(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Genero: "+ this.genero);
        System.out.println("Edad: "+ this.edad);
    }

    void jugarVideojuegos(Persona p){
        System.out.println(this.nombre + " Esta jugando con: "+ p.nombre);
    }


}