import java.io.IOException;

/**
 * ExceptionTest
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            // int a=10, b=0;
            // int res=a/b;
            // System.out.println("Division : "+res);
            int[] arr= new int[3];
            arr[0]=1;
            arr[1]=1;
            arr[2]=1;
            arr[3]=1;
        } 
        // catch (IOException e) {
        //     //TODO: handle exception
        //     System.out.println(e);
        //     System.out.println("Testing");
        // }
        catch(ArrayIndexOutOfBoundsException ea){
            System.out.println(ea);

        } 
        finally{
            System.out.println("*********Finally block********");
        }
        
    }
}