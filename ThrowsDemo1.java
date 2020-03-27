/**
 * ThrowsDemo1
 */
public class ThrowsDemo1 {

    public static void main(String[] args) {
        try {
            int[] arr={10,20,30};
            int b=0;
            int res= arr[4]/b;
            System.out.println("Result is : "+res);
         } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            //TODO: handle exception
            e.printStackTrace();
        }  
        // catch(ArithmeticException ex){
        //     ex.printStackTrace();
        // }
    }
}