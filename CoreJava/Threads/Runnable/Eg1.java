package CoreJava.Threads.Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// In this program, we are creating an ExecutorService with ten threads and assigning it an anonymous runnable 
// implementation which performs a task to print "ExecutorService" and after its task is over,
// we are shutting down the executor service.

public class Eg1 {
    public static void main(String[] args) {
                ExecutorService executorService1 = Executors.newFixedThreadPool(10);  
                ExecutorService executorService2 = Executors.newFixedThreadPool(10);  
                // execute() method takes in a runnable object and performs its task asynchronously.
                executorService1.execute(new Runnable() {  
                      
                    @Override  
                    public void run() {  
                        System.out.println("ExecutorService 1");  
                          
                    }  
                });  
                executorService1.shutdown();  

                // submit() method takes in a runnable object and returns a Future object.
                // This object is later on used to check the status of Runnable whether it has completed execution or not
                executorService2.submit(new Runnable() {  
              
                    @Override  
                    public void run() {  
                        System.out.println("ExecutorService 2");  
                          
                    }  
                }); 
            }  
}
