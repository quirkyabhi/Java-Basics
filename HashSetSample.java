import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<String>();
        set.add("Abhi");
        set.add("jeet");
        set.add("yash");
        set.add("jai");
        set.add("shree");
        set.add("shree");
        set.add(null);
        set.add(null);

        Iterator itr= set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}