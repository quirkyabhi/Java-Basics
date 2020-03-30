/**
 * ThreadDemo extending thread
 */
public class ThreadDemo extends Thread {
    public void run(){
        Thread t1 = Thread.currentThread();
        System.out.println("Thread starts : "+t1.getName()+"   "+t1.getPriority()
        );
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(500);    
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Thread ends "+t1.getName()+"   "+t1.getPriority() );
    }
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();

        t1.start();
        t1.setName("First_thread");
        try {
            t1.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        t3.setName("Third_thread");
        t2.setName("Second_thread");
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.start();
        
        
    }
    
}

/**
 * ThreadDemo implementing  runnable
 */

// public class ThreadDemo implements Runnable {
//     public void run(){
//         System.out.println("Thread is running");
//     }
//     public static void main(String[] args) {
        
//         ThreadDemo obj = new ThreadDemo();
//         Thread t1= new Thread(obj);
//         t1.start();
//     }
    
// }