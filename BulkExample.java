import java.util.HashSet;
import java.util.Set;

public class BulkExample {
    public static void main(String[] args) {
        Set unique= new HashSet<String>();
        Set dups= new HashSet<String>();
        for (String a : args) {
            if (!unique.add(a)) {
                dups.add(a);
            }
        }
        System.out.println("Without remove : "+ unique);
        unique.removeAll(dups);
        System.out.println("After remove Unique : "+ unique);
        System.out.println("Duplicates : "+ dups);
    }
}