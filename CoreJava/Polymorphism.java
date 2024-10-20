package CoreJava;

class A {

    public A() {
        System.out.println("in Const. A");
    }

    public void show() {
        System.out.println("In A");
    }
}

class B extends A {

    public B() {
        System.out.println("in Const. B");
    }

    public B(String str) {
        System.out.println("in Const. B: " + str);
    }

    public void show() {
        System.out.println("In B");
    }
}

class C extends B {

    public C(String str) {
        super(str);
        System.out.println("in Const. C");
    }

    public void show() {
        System.out.println("In C");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        System.out.println("Calling A Class: ");
        A aobj = new A();
        aobj.show();
        System.out.println("Calling B Class: ");
        B bobj = new B();
        bobj.show();
        System.out.println("Calling C Class: ");
        C cobj = new C("test parameter");
        cobj.show();
        
    }
}
