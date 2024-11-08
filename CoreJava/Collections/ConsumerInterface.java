package CoreJava.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
        public static void main(String[] args) {

        Consumer<Integer> con = new Consumer<Integer>() {

            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
            
        };
        
        List<Integer> num = new ArrayList<>();

        num.add(45);
        num.add(23);
        num.add(2);
        num.add(1);
        num.add(122);

        num.forEach(con);

        // and now since Consumer is an function interface so we can modify it:

        Consumer<Integer> con1 = (n) -> System.out.println(n);
        
        List<Integer> num1 = Arrays.asList(45,23,2,1,122);
        num1.forEach(con1);

        // it can further reduce to:

        List<Integer> num2 = Arrays.asList(45,23,2,1,122);
        num2.forEach((n) -> System.out.println(n));


    }
}
