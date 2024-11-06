package CoreJava.Threads.Runnable;

class NewThread3 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("in New Thread 3");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class InterfaceThread {
    
    public static void main(String[] args) {
        
        // normal class calling
        Runnable obj3 = new NewThread3();

        // implementing class implementing interface with lambda
        Runnable obj4 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("in New Thread 4");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread obj1 = new Thread(obj3);
        Thread obj2 = new Thread(obj4);

        obj1.start();
        obj2.start();
    }
}
