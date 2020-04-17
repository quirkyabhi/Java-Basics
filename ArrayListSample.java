import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList list= new ArrayList();
        list.add(11);
        list.add(0,"Abhi");
        list.add(1,"jeet");
        list.add(2,"pansari");
        list.add(3,"anu");
        System.out.println("List is : "+list);

        ArrayList<String> list2= new ArrayList<String>();
        list2.add("hello");
        list.addAll(1,list2);
        System.out.println("List is : "+list);
        list.remove(1);
        System.out.println("removal : "+ list);
        System.out.println("Element at 2"+  list.get(2));
        list.set(2, "Narendra");
        list.add("jeet");
        System.out.println("List is : "+list);

        System.out.println("index of jeet : "+list.indexOf("jeet"));
        System.out.println("index of jeet : "+list.lastIndexOf("jeet"));
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("Using Iterator Interface");
        Iterator it= list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        // Iterator it= list.iterator();
        if(it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
        System.out.println("after removal "+ list);
    }
}