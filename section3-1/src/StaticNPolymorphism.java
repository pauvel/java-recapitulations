import static java.lang.Math.sqrt;


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


    static {
        System.out.println("This is a static block");
    }

    static {
        System.out.println("This is a static block # 2");
    }
    public static void main(String[] args) {
        System.out.println("StaticNPolymorphism");
        A a = new B();
        B b = new B();
        a.foo();
        b.foo();

        System.out.println(sqrt(25.45));

    }
}
