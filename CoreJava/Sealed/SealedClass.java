package CoreJava.Sealed;

// classes which are permitted to extend the sealed classes must be "non-sealed", "sealed" or "final"
// a "non-sealed" class regardless it been extending a sealed class can be inherited by another class
// A sealed class and extend and implements other classes and interfaces

sealed class sealed1 extends Thread implements Cloneable permits sealed2, sealed3{}
non-sealed class sealed2 extends sealed1 {}
final class sealed3 extends sealed1{}
class sealed4 extends sealed2 {}
public class SealedClass {
    public static void main(String[] args) {
        
    }
}
