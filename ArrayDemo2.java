import java.util.Scanner;

/**
 * ArrayDemo2
 */
public class ArrayDemo2 {

    public static void main(String[] args) {
        int count, max, min;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        count= sc.nextInt();
        arr= new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element : ");
            arr[i]= sc.nextInt();
        }
        for (int i : arr) {
            System.out.println(" Element is : " + i);
        }
        max= arr[0];
        min= arr[0];
        for (int i : arr) {
            if( max<i){
                max=i;
            }
            if(min>i){
                min=i;
            }
        }
        System.out.println("Max : "+ max);
        System.out.println("Min : "+min);
        sc.close();
    }
}