package CoreJava;

public class WrapperClass {

    public static void main(String[] args) {
        int num = 23;

        // taking primitive value and storing in wrapper object
        // boxing
        Integer num1 = Integer.valueOf(num);
        // auto - boxing
        Integer num2 = num;

        // taking wrapper object value and storing in primitive value
        // unboxing
        int num3 = num2.intValue();
        // auto - unboxing
        int num4 = num2;


        System.out.println("original primitive value: " + num + ", boxing: " + num1 + ", auto-boxing: " + num2 + ", unboxing: " + num3 + ", auto-unboxing: " + num4);

        String str = "56";
        System.out.println("type of str: " + (str instanceof String));
        Integer num5 = Integer.parseInt(str);
        System.out.println("type of int: " + (num5 instanceof Integer));

        System.out.println("String to int: " + num5);
    }
    
}
