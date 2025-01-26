class A {
    static void foo(){
        System.out.println("A.foo");
    }
}

class B extends A {

//    @Override
    static void foo(){
        System.out.println("B.foo");
    }

}

public class StaticNPolymorphism {
    public static void main(String[] args) {
        System.out.println("StaticNPolymorphism");
        A a = new B();
        B b = new B();
        a.foo();
        b.foo();
    }
}
