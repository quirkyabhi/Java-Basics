import java.util.Scanner;

/**
 * StaticSum
 */
public class StaticSum {

    public static int sum(int a, int b) {
        return (a+b);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int var1= sc.nextInt();
        int var2=sc.nextInt();
        System.out.println("SUM is : "+ sum(var1,var2));
    }

}