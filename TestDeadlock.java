/**
 * TestDeadlock
 */
public class TestDeadlock {

    public static void main(String[] args) {
        final String Resource1= "First Resource";
        final String Resource2= "Second Resource";
        
        Thread t1= new Thread(){
            public void run() {
                synchronized(Resource1){
                    System.out.println("Thread 1: locked Resource 1");
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){e.printStackTrace();}
                    synchronized(Resource2){
                        System.out.println("Thread 2 : locked resource 2.....");
                    }
                } 
                
            }
        };
        Thread t2= new Thread(){
            public void run() {
                synchronized(Resource2){
                    System.out.println("Thread 2: locked Resource 2");
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){e.printStackTrace();}
                    synchronized(Resource1){
                        System.out.println("Thread 1 : locked resource 1....");
                    }
                } 
                
            }
        };
        t1.start();
        t2.start();
        

    }
}