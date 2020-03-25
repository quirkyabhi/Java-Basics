import java.util.Scanner;

/**
 * ArrayAddition
 */
public class ArrayAddition {

    public static void main(String[] args) {
        int rcount,ccount;
        int[][] arr, arr1, arr2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array limit (row): ");
        rcount= sc.nextInt();
        System.out.print("Enter array limit (column): ");
        ccount= sc.nextInt();
        arr= new int[rcount][ccount];
        System.out.println("Enter Element for array 1: ");
        
        for (int i = 0; i < rcount; i++) {
            for (int j = 0; j < ccount; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println();
        arr1= new int[rcount][ccount];
        System.out.println("Enter Element for array 2: ");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < ccount; j++) {
                arr1[i][j]=sc.nextInt();    
            }
        }
        
        arr2= new int[rcount][ccount];
        System.out.println("Adding them....");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < ccount; j++) {
                arr2[i][j]=arr[i][j]+arr1[i][j];
                // System.out.print(" ");    
            }
            // System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < ccount; j++) {
                System.out.print(" " +arr2[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}