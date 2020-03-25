import java.util.ArrayList;

/**
 * WrapperDemo
 */
public class WrapperDemo {

    public static void main(String[] args) {

        Character ch='C';
        char c = ch;                 //unboxing
        System.out.println(c);
        
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(10);                 //auto-boxing
        arr.add(20);

        int a= arr.get(0);
        System.out.println(a);

        for (int n: arr) {           //unboxing
            System.out.println(n);
        }
    }
}