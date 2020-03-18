import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        int  a=0,b=1,c;
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        obj.close();
    }
}
