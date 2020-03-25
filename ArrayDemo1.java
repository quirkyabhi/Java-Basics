import java.util.Scanner;

/**
 * ArrayDemo1
 */
public class ArrayDemo1 {

    public static void main(String[] args) {
        // int[] arr;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        count = sc.nextInt();
        int[] arr= new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter the element : ");
            arr[i]= sc.nextInt();
        }
        for (int i : arr) {
            System.out.println("Element : "+ i);
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element : "+arr[i]);
        }
        sc.close();

    }
}