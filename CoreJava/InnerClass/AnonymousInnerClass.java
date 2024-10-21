package CoreJava.InnerClass;

class Class3 {
    public void show() {
        System.out.println("in Class3 class");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        // Here we are creating an object of annonymous inner class and not Class3
        Class3 obj = new Class3() {
            public void show() {
                System.out.println("in inner new Class3 class");
            }
        };
        obj.show();
    }
}
