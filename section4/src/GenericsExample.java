class Transport {}
class Vehicle extends Transport{}
class Sport extends Vehicle {}

//This line of code defines a generic class BeanGeneric
// that can work with any type T, as long as T is a subclass of Transport (or Transport itself)
class BeanGeneric <T extends Transport> {
    private T value;

    public BeanGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


public class GenericsExample {

    public static void main(String[] args) {
        BeanGeneric<Transport> bean = new BeanGeneric<>(new Transport());
        BeanGeneric<Vehicle> bean2 = new BeanGeneric<>(new Vehicle());
        BeanGeneric<Sport> bean3 = new BeanGeneric<>(new Sport());

    }

}
