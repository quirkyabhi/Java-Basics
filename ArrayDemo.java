/**
 * ArrayDemo
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0]=10;
        arr[1]=11;
        arr[2]=22;
        int[] arr2={101,111,122};
        for (int n : arr) {
            System.out.println(n);
            
        }
        System.out.println("");
        for (int m : arr2) {
            System.out.println(m);
            
        }
    }
}