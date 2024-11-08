package CoreJava.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Marks {
    int marks;
    private String subjects;

    public Marks(int marks, String subjects) {
        this.marks = marks;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Marks [marks=" + marks + ", subjects=" + subjects + "]";
    }
}

public class ComparatorSortWithClass {
    public static void main(String[] args) {

        Comparator<Marks> com = (i, j) -> i.marks > j.marks ? 1 : -1;

        List<Marks> marks = new ArrayList<>();

        marks.add(new Marks(80, "maths"));
        marks.add(new Marks(34, "hindi"));
        marks.add(new Marks(67, "physics"));
        marks.add(new Marks(99, "chemistry"));

        Collections.sort(marks, com);

        for (Marks val : marks) {
            System.out.println(val);
        }
    }
}
