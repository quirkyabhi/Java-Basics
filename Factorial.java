import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        int  fac=1;
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        for (int i = 1; i < n+1; i++) {
            fac=fac*i;
            
        }
        System.out.println("Factorial : "+fac);
        obj.close();
    }
}