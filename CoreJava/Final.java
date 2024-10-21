package CoreJava;

final class FinalClass {
    public void show() {
        System.out.println("in FinalClassEg1");
    }
}

// The type SubFinalClass cannot subclass the final class FinalClass
// class SubFinalClass extends FinalClass {

// }

class FinalMethod {
    public final void show() {
        System.out.println("in FinalMethod");
    }
}

class SubFinalMethod extends FinalMethod {
    // Cannot override the final method from FinalMethod class
    // public void show() {
    // System.out.println("in SubFinalMethod");
    // }
}

public class Final {
    public static void main(String[] args) {
        final int num = 5;
        // The final local variable num cannot be assigned. It must be blank and not
        // using a compound assignment
        // num = 9;
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
