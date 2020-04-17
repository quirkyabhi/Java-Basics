import java.util.HashSet;
import java.util.Iterator;

class HashStudentSec {
    String name, branch, sec;
    int rollNo;
    public HashStudentSec(int rollNo, String name, String branch, String sec )
    {
        this.rollNo= rollNo;
        this.name= name;
        this.branch= branch;
        this.sec=sec;
    }
}

/**
 * HashStudent
 */
public class HashStudent {
    public static void main(String[] args) {
        HashSet<HashStudentSec> set = new HashSet<HashStudentSec>();
        
        set.add(new HashStudentSec(101,"abhi","cse","a"));
        set.add(new HashStudentSec(102,"abhijeet","cse","b"));
        set.add(new HashStudentSec(103,"jeet","cse","c"));
        set.add(new HashStudentSec(103,"jeet","cse","c"));
        Iterator itr= set.iterator();
        System.out.println("Iterator Method: ");
        System.out.println();
        while (itr.hasNext()) {
            HashStudentSec i=(HashStudentSec)(itr.next());
            System.out.println(i.rollNo +" "+ i.name+" "+i.branch+" "+i.sec);
        }
        System.out.println();
        System.out.println("For each loop Method: ");
        System.out.println();

        for (HashStudentSec s : set) {
            System.out.println(s.rollNo+" "+s.name+" "+s.branch+" "+s.sec);
        }
    }
}
