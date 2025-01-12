// package section3.classes;

// import classes.Persona;

public class Main {
    public static void main(String args[]){
        System.out.println("Main loaded!");
        Persona persona1 = new Persona();
        persona1.nombre = "paul";
        persona1.genero = 'h';
        persona1.edad = 20;

        persona1.imprimirInfo();

        Persona persona2 = new Persona();
        persona2.nombre = "Juanito";
        persona2.genero = 'h';
        persona2.edad = 21;
        persona2.imprimirInfo();

        persona1.jugarVideojuegos(persona2);

        System.out.println("<<<<<<<<<>>>>>>>>>>>><<<<<<<>>>>>>>>>>>>");

        Persona persona3 = new Persona("Pedrito", (short)15, 'h');
        persona3.imprimirInfo();

        // Inspecting String class.
        String name = "JJ";
        
    }
}