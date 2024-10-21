package CoreJava.InnerClass;


class Class1 {
    class InnerClass1 {
        public void show() {
            System.out.println("in inner class");
        }
    }
}
public class ConcreteInnerClass {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        Class1.InnerClass1 innerObj = obj.new InnerClass1();
        innerObj.show();
    }
}
