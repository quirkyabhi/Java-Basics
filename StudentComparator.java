import java.util.Comparator;

public class StudentComparator implements Comparator<StudentPrio>{
    public int compare(StudentPrio s1, StudentPrio s2){
        if (s1.rollNo>s2.rollNo) {
            return 1;
        } else if(s1.rollNo<s2.rollNo){
            return -1;
        }
        return 0;
    }
}