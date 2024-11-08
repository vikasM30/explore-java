package CoreJava.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {
        public static void main(String[] args) {

        Comparator<Integer> com = (i,j) -> i%10 > j%10 ? 1 : -1;
        
        List<Integer> num = new ArrayList<>();

        num.add(45);
        num.add(23);
        num.add(2);
        num.add(1);
        num.add(124);

        // sort on the basis of last digit of number
        Collections.sort(num, com);

        for (Integer val : num) {
            System.out.println(val);
        }
    }
}
