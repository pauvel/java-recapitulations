
class BeanGeneric <T> {
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
        BeanGeneric<String> bean = new BeanGeneric<>("Pauvel");
        System.out.println(bean.getValue());

        // bean.setValue(99);

        System.out.println(bean.getValue());
    }

}
