package CoreJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(4);
        l1.add(43);
        l1.add(22);
        l1.add(14);

        for (Integer val : l1) {
            System.out.println(val);
        }
    }
}
