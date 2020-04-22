import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<String>();
        qu.add("arg0");
        qu.add("ab");
        qu.add("abhi");
        qu.add("arg2");

        System.out.println("Elements in queue :" + qu);
        System.out.println("Remove :" + qu.remove());
        System.out.println("Element :" + qu.element());
        System.out.println("Poll :" + qu.poll());
        System.out.println("Peek :" + qu.peek());
        System.out.println("Elements in queue :" + qu);


    }
}