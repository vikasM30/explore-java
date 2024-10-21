package CoreJava;

class ClassAA {
    public void show1() {
        System.out.println("In ClassAA");
    }
}

class ClassBB extends ClassAA {
    public void show2() {
        System.out.println("In ClassBB");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        // Up Casting
        ClassAA obj = new ClassBB();
        obj.show1();
        // The method show2() is undefined for the type ClassAA
        // obj.show2();

        // Down Casting
        ClassBB obj1 = (ClassBB) obj;
        obj1.show1();
        obj1.show2();

        // For Primitives
        double d = 65.7734672;
        float f = (float) d;
        float i = (int) d;
        int ii = (int) d;

        System.out.println(d + " : " + f + " : " + i + " : " + ii);
    }
}
