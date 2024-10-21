package CoreJava.InnerClass;

abstract class Class4 {
    abstract public void show();
}

public class AbstractClassWithInnerClass {
    public static void main(String[] args) {

        // Here we are creating an object of annonymous inner class and not Class3
        Class4 obj = new Class4() {
            public void show() {
                System.out.println("in implementation of abstract class using inner class");
            }
        };
        obj.show();
    }
}
