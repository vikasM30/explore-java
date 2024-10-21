package CoreJava.InnerClass;

class Class2 {
    static class InnerClass2 {
        public void show() {
            System.out.println("in inner class");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        Class2.InnerClass2 innerObj = new Class2.InnerClass2();
        innerObj.show();
    }
}
