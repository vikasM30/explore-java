package CoreJava.Sealed;

// interfaces which are permitted to extend the sealed interfaces must be either "non-sealed" or "sealed"
// a "non-sealed" interface regardless it been extending a sealed interface can be inherited by another interface
// A sealed interface and extend interfaces

sealed interface sealed1 permits sealed2, sealed3{}
non-sealed interface sealed2 extends sealed1 {}
sealed interface sealed3 extends sealed1 permits sealed4{}
non-sealed interface sealed4 extends sealed3{}
public class SealedInterface {
    public static void main(String[] args) {
        
    }
}
