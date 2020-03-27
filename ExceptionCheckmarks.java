import java.util.Scanner;

class Marks{
    public void getMarks(int marks) throws Exception {
        if (marks<75) {
            throw new Exception("Insufficient Marks");
            
        }
        System.out.println("Marks "+marks);
    }
}

/**
 * ExceptionCheckmarks
 */
public class ExceptionCheckmarks {

    public static void main(String[] args) {
        int mark;
        Scanner oScanner= new Scanner(System.in);
        Marks oMarks= new Marks();
        System.out.println("Enter marks");
        mark=oScanner.nextInt();
        try {
            oMarks.getMarks(mark);
        } catch (Exception e) {
            //TODO: handle exception
            // System.out.println("Insufficient Marks");
            e.printStackTrace();
        }finally{
            oScanner.close();
        }
        
    }
}