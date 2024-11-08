package CoreJava;

class TestLVTI {

    public void show() {
        System.out.println("hi");
    }
}

public class LocalVarTypeInferenceV10 {
    public static void main(String[] args) {
        int i;

        // a variable declared with "var" must be initialised
        // var k;
        var m = 10;

        var obj = new TestLVTI();
        obj.show();

        var num = new int[10];
        num[0] = 3;
        System.out.println(num[0]);
    }
}
