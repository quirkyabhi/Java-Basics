import java.util.Scanner;

import sun.jvm.hotspot.tools.SysPropsDumper;

/**
 * Pattern
 */
public class Pattern {
    public static void main(String[] args) {
        // int i=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int no= sc.nextInt();
        int n = 1;
        for (int p = 1; p <= no; p++){
            for (int i = no; i >= p; i--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= p; m++) {
                System.out.print(m);
            }
            for (int y = p - 1; y >= 1; y--) {
                System.out.print(y);
            }
            System.out.println("");
        }
    }

}