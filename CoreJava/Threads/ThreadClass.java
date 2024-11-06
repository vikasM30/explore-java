package CoreJava.Threads;

class NewThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("in New Thread 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class NewThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("in New Thread 2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ThreadClass {

    public static void main(String[] args) {
        NewThread1 obj1 = new NewThread1();
        NewThread2 obj2 = new NewThread2();
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        obj1.setPriority(1);
        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();
    }
    
}
