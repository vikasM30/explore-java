package CoreJava;

class StaticClass {
    static {
        System.out.println("in static block");
    }
}
public class StaticClassTest {
    public static void main(String[] args) {
        try {
            Class.forName("StaticClass");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
