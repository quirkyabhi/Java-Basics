import java.util.Scanner;

/**
 * ArraySearch
 */
public class ArraySearch {

    public static void main(String[] args) {
        int count, ele, index=0;
        boolean flag= false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array limit");
        count= sc.nextInt();
        int[] arr= new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        ele= sc.nextInt();
        for (int i : arr) {
            index+=1;
            if (i==ele) {
                flag= true;
                break;
            }
        }
        if (flag) {
            System.out.println("Found at  : "+ index);
            } 
        else {
            System.out.println("Not found");    
        }
        
        sc.close();
    }
}