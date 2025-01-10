# Declarar Varias Clases en un Archivo `.java`

Este repositorio explora qué sucede cuando declaras varias clases dentro de un único archivo `.java` y cómo se comporta el compilador si una de esas clases es pública.  

---

## Declarar Varias Clases en un Archivo `.java`

En Java, es completamente válido declarar múltiples clases dentro de un mismo archivo `.java`. Sin embargo, existen algunas reglas importantes que debes seguir:  

1. **Clases públicas**:  
   - Si una de las clases dentro del archivo es declarada como `public`, el nombre del archivo **debe coincidir exactamente con el nombre de la clase pública** (incluida la distinción entre mayúsculas y minúsculas).  
   - Si el nombre del archivo y el de la clase pública no coinciden, el compilador lanzará un error como:  
     ```
     Error: The public type [ClassName] must be defined in its own file.
     ```

2. **Clases no públicas**:  
   - Puedes tener tantas clases no públicas (por ejemplo, `default`, `protected`, o `private`) como desees dentro del mismo archivo.  
   - Estas clases no requieren que el archivo coincida con su nombre.  

3. **Acceso a clases no públicas**:  
   - Las clases no públicas solo pueden ser accedidas por otras clases dentro del mismo paquete, a menos que sean `private`, en cuyo caso solo son visibles dentro de la clase en la que están definidas.  

---

## ¿Por qué solo una clase pública?  

En Java, la restricción de tener solo una clase pública por archivo y que el nombre del archivo coincida con ella obedece a principios de organización y claridad:  

1. **Mantenimiento del código**:  
   - Tener el archivo con el mismo nombre que la clase pública facilita encontrar rápidamente el archivo correspondiente a una clase en proyectos grandes.  

2. **Convenciones de diseño**:  
   - Java utiliza esta regla como parte de sus convenciones para organizar el código, asegurando que cada clase pública esté claramente definida y separada.  

3. **Evitar conflictos en el compilador**:  
   - Si se permitieran múltiples clases públicas en un archivo, podría haber ambigüedades al momento de compilar o cargar clases en memoria.  

---

## Ejemplo de Código  

Aquí hay un ejemplo práctico:  

```java
// Archivo: MyClass.java
public class MyClass {
    public void sayHello() {
        System.out.println("Hello from MyClass!");
    }
}

class HelperClass {
    public void help() {
        System.out.println("Helping from HelperClass!");
    }
}