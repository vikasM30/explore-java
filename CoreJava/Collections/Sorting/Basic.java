package CoreJava.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        
        List<Integer> num = new ArrayList<>();

        num.add(45);
        num.add(23);
        num.add(2);
        num.add(1);
        num.add(122);

        Collections.sort(num);

        for (Integer val : num) {
            System.out.println(val);
        }
    }
}
