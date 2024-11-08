package CoreJava.StreamInterface;

import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class StreamInt {
    public static void main(String[] args) {
        int add = IntStream.range(1,10).reduce(0,(a,c) -> a+c);
        System.out.println(add);

        double[] numbers = { 2.5, 3.1, 1.7, 4.8, 6.2 };

        // Creating a DoubleStream from the array
        DoubleStream stream = DoubleStream.of(numbers); 

        // Calculating the average of the numbers
        double average = stream.average().orElse(0.0);

        System.out.println("Average: " + average); 


        LongStream stream1 = LongStream.of(-7L, -9L, -11L); 
  
        // Displaying the sequential ordered stream 
        stream1.forEach(System.out::println);
    }
}
