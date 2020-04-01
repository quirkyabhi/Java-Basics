/**
 * SynchronizedExample
 */
/**
 * ShowPrint
 */
class ShowPrint{   
    // public synchronized void printable(int n) {
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println(n*i);
    //     }
    // }
    // public  void printable(int n) {
    //     synchronized(this){
    //         for (int i = 0; i < 5; i++) {
    //         System.out.println(n*i);
    //         }
    //         System.out.println("Current Thread : "+Thread.currentThread().getName());
    //     }
    // }
    public static synchronized void printable(int n) {
        for (int i = 0; i < 5; i++) {
            System.out.println(n*i);
        }
    }
}

/**
 * SynchronizedExample
 */
class Mythread1 extends Thread {
    // ShowPrint t;
    // Mythread1(ShowPrint t){
    //     this.t=t;
    // }
    public void run(){
        // t.printable(5);
        ShowPrint.printable(5);

    }
}

class Mythread2 extends Thread {
    // ShowPrint t;
    // Mythread2(ShowPrint t){
    // this.t=t;
    // }
    public void run(){
        // t.printable(100);
        ShowPrint.printable(100);
    }
}

/**
 * SynchronizedExample
 */
public class SynchronizedExample {

    public static void main(String[] args) {
        // ShowPrint obj = new ShowPrint();
        // Mythread1 t1= new Mythread1(obj);
        // Mythread2 t2= new Mythread2(obj);
        Mythread1 t1= new Mythread1();
        Mythread2 t2= new Mythread2();
        t1.start();
        t2.start();
    }
}
