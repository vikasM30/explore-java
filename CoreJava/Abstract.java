package CoreJava;

abstract class AbsClass {
    public abstract void show();
}

class SubAbsClass extends AbsClass {

    @Override
    public void show() {
        System.out.println("Extending Abs class");
    }

}

public class Abstract {

    public static void main(String[] args) {
        // cannot create object of an abstract class
        // AbsClass obj = new AbsClass();
        AbsClass obj = new SubAbsClass();
        obj.show();
    }
}
