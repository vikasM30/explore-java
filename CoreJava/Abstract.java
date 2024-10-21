package CoreJava;

abstract class AbsClass {
    abstract void show();
}

class SubAbsClass extends AbsClass {

    @Override
    void show() {
        System.out.println("Extending Abs class");
    }

}
public class Abstract {
    // AbsClass obj = new AbsClass();
    SubAbsClass obj = new SubAbsClass();
    obj.show();
}
