import java.util.PriorityQueue;

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<StudentPrio> pq= new PriorityQueue<StudentPrio>(new StudentComparator());
        StudentPrio s1= new StudentPrio("Nishant", 3);
        StudentPrio s2= new StudentPrio("kundan", 1);
        StudentPrio s3= new StudentPrio("abhi", 2);
        StudentPrio s4= new StudentPrio("yash", 2);

        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);

        System.out.println("Students: ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getName());
        }

    }
}