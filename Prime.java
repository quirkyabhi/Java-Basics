import java.util.Scanner;

/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n= obj.nextInt();
        int j=0;
        // System.out.println(n);
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0){
                j++;
                System.out.println(j);
            }
        }
        if (j==0) {
            System.out.println(" Prime :" + n);
            
        }
        else
            System.out.println("Not Prime");   
        
    }
}