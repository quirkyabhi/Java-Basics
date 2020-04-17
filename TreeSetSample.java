import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {
        int[] array={11,22,44,12,2,7};
        HashSet set= new HashSet<Integer>();
        for (int n : array) {
            set.add(n);
        }
        System.out.println(set);
        TreeSet tset= new TreeSet<Integer>(set);
        System.out.println(tset);
    }
}