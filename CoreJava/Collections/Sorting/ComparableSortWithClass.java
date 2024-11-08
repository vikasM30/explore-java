package CoreJava.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SubjectMarks implements Comparable<SubjectMarks> {
    int marks;
    private String subjects;

    public SubjectMarks(int marks, String subjects) {
        this.marks = marks;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "SubjectMarks [marks=" + marks + ", subjects=" + subjects + "]";
    }

    @Override
    public int compareTo(SubjectMarks o) {
        return this.marks > o.marks ? 1 : -1;
    }
}

public class ComparableSortWithClass {
        public static void main(String[] args) {

        List<SubjectMarks> marks = new ArrayList<>();

        marks.add(new SubjectMarks(80, "maths"));
        marks.add(new SubjectMarks(34, "hindi"));
        marks.add(new SubjectMarks(67, "physics"));
        marks.add(new SubjectMarks(99, "chemistry"));

        Collections.sort(marks);

        for (SubjectMarks val : marks) {
            System.out.println(val);
        }
    }
}
