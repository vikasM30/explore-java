package CoreJava.Collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {


        System.out.println("Un-sorted: Hash Set");
        
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

        System.out.println("Sorted: Tree Set");

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

        System.out.println("Use of Iterator: Tree Set");

        // use of iterator
        Collection<Integer> l3 = new TreeSet<Integer>();
        l3.add(4);
        l3.add(43);
        l3.add(22);

        Iterator<Integer> values = l3.iterator(); 

        while (values.hasNext()) {
            System.out.println(values.next());
        }

        System.out.println("Sorted: Linked Hash Set");

        Collection<Integer> l4 = new LinkedHashSet<Integer>();
        l4.add(4);
        l4.add(43);
        l4.add(22);
        l4.add(14);
        l4.add(4);

        for (Integer val : l2) {
            System.out.println(val);
        }
    }
}
