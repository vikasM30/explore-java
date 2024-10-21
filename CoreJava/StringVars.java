package CoreJava;

public class StringVars {
    public static void main(String[] args) {

        System.out.println("Normal string");
        String str0 = "Vikas";
        str0 = str0.concat(" Mishra");
        System.out.println(str0);
        System.out.println();
        System.out.println("Stringbuffer Ex.");
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());
        StringBuffer str2 = new StringBuffer("Test");
        System.out.println(str2.capacity());
        System.out.println(str2);
        System.out.println(str2.append(" Now"));
        System.out.println(str2.capacity());
        System.out.println();
        System.out.println("Converting stringbuffer to normal string");
        String valStr = str2.toString();
        System.out.println(valStr);
        System.out.println();
        System.out.println("Stringbuffer Ex.");
        StringBuilder strBuild = new StringBuilder("Vikas");
        System.out.println(strBuild);
    }
}
