package CoreJava;

interface I {

    int age = 21; // its already final and static so we have to initialise it.
    void call(); // its already public and abstract

    void camera();
}

class IA implements I {

    @Override
    public void call() {
        System.out.println("IA calling...");
    }

    @Override
    public void camera() {
        System.out.println("IA video...");
    }
}


public class InterfaceEg {
    public static void main(String[] args) {
        I a = new IA();

        a.call();
        a.camera();

        System.out.println(I.age);
    }
}
