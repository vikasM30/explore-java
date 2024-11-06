package CoreJava.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {

        // un-sorted
        Set<Integer> l1 = new HashSet<Integer>();
        l1.add(4);
        l1.add(43);
        l1.add(22);
        l1.add(14);
        l1.add(4);

        for (Integer val : l1) {
            System.out.println(val);
        }

        System.out.println();

        // Sorted
        Set<Integer> l2 = new TreeSet<Integer>();
        l2.add(4);
        l2.add(43);
        l2.add(22);
        l2.add(14);
        l2.add(4);

        for (Integer val : l2) {
            System.out.println(val);
        }
    }
}
