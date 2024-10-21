// this is also call runtime-Polymorphism
package CoreJava;

class ClassA {
    public void show() {
        System.out.println("in A");
    }
}

class ClassB extends ClassA {
    public void show() {
        System.out.println("in B");
    }
}

class ClassC extends ClassA {
    public void show() {
        System.out.println("in C");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.show();

        obj = new ClassB();
        obj.show();

        obj = new ClassC();
        obj.show();
    }
}
