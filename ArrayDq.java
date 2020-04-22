import java.util.*;
import java.util.Deque;
public class ArrayDq {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.offer("abhi");
        dq.add("kundan");
        dq.offerFirst("arg0");
        dq.addLast("arg011");
        for(String s: dq){
            System.out.println(s);    
        }
    }
}