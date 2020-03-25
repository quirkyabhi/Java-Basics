import java.util.Arrays;
import java.util.Scanner;

/**
 * ArrayDemo2
 */
public class ArrayDemo2 {

    public void printArray(int[] arr1) {
        for (int i : arr1) {
            System.out.println(" Element is : " + i);
        }
        
    }
    public int[] returnArray() {
        int[] arr2={6,7,8,9,3};
        return arr2;
    }
    public static void main(String[] args) {
        int count, max, min;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        ArrayDemo2 obj= new ArrayDemo2();
        System.out.print("Enter length : ");
        count= sc.nextInt();
        arr= new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element : ");
            arr[i]= sc.nextInt();
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
        int[] arr1= {1,2,3,3,4,5};
        obj.printArray(arr1);
        System.out.println("");
        obj.printArray(obj.returnArray());

        int[] arr3=obj.returnArray();
        arr3[0]=88;

        System.out.println("");

        obj.printArray(arr3);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Max : "+ max);
        System.out.println("Min : "+min);

        sc.close();
    }
}