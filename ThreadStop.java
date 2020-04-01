/**
 * ThreadStop
 */
public class ThreadStop extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i  = "+i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
                //TODO: handle exception
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        ThreadStop t1= new ThreadStop();
        ThreadStop t2= new ThreadStop();
        ThreadStop t3= new ThreadStop();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main thread");
        t2.suspend();
        t2.resume();
        // t1.stop();

    }
}