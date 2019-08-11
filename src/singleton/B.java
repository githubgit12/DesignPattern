package singleton;

class A {
    private static A a = new A();

    static {
        System.out.println("static");
    }

    {
        System.out.println("A");
    }

}

public class B extends A {

    public B(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        B b = new B();
    }

}


