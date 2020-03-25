import java.util.Scanner;

/**
 * ArrayAvg
 */
public class ArrayAvg {

    public static void main(String[] args) {
        int count, sum=0, length=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array limit");
        count= sc.nextInt();
        int[] arr= new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element : ");
            arr[i]=sc.nextInt();
        }
        
        for (int i : arr) {
            sum+=i;
            length+=1;

        }
        System.out.println("Average is : "+ ((float)sum/length));


        sc.close();
    }
}