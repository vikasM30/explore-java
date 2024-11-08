package CoreJava;

// this is alternative to define whole class, it itself defines methods like getters, tostring, hashcode, constructors/parametrized-constructors, and toequal methods.
// by default in record, instance variables are sent as parameters
// instance variables are by default "private and final"
// as instance variables are by default "private and final", so there is no setters available to it

record TestRecord(int age, String name) {}
public class records {
    public static void main(String[] args) {
        TestRecord tr1 = new TestRecord(23,"rohan");
        TestRecord tr2 = new TestRecord(44,"Manju");

        System.out.println(tr1.equals(tr2));
        System.out.println(tr1);
    }
}
