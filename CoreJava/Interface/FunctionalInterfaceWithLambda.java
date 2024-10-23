package CoreJava.Interface;

@FunctionalInterface
interface IFunctional {
    int add(int i, int j);
    // Invalid '@FunctionalInterface' annotation; IFunctional is not a functional interface as it only allows 1 method to be declared
    // int add1(int i, int j);
}

public class FunctionalInterfaceWithLambda {
    public static void main(String[] args) {
        IFunctional obj = (i,j) -> i*j;
        System.out.println(obj.add(3,4)); 
    }
}
