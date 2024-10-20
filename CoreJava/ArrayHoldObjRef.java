package CoreJava;

public class ArrayHoldObjRef {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Rohan");
        obj.setAge(24);

        Student obj2 = new Student();
        obj2.setName("Krish");
        obj2.setAge(33);

        Student student[] = new Student[2];
        student[0] = obj;
        student[1] = obj2;

        for (Student student2 : student) {
            System.out.println(student2.getName() + " " + student2.getAge());
        }
    }
}