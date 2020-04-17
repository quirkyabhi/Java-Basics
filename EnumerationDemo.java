import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationDemo {
    // public static void main(String[] args) {
    //     Vector vector = new Vector();
    //     for (int i = 0; i < 10; i++) {
    //         vector.addElement(i);
    //     }
    //     System.out.println(vector);
    //     Enumeration en = vector.elements();
    //     while (en.hasMoreElements()) {
    //         System.out.println(en.nextElement());
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayList<Integer> list= new ArrayList<Integer>();
    //     for (int i = 0; i < 10; i++) {
    //         list.add(i);
    //     }
    //     System.out.println(list);
    //     Iterator en= list.iterator();
    //     while (en.hasNext()) {
    //         int i= (Integer)en.next();
    //         System.out.println(i);
    //         if (i%2==0) {
    //             en.remove();
    //         }
    //     }
    //     System.out.println(list);
    // }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        ListIterator en= list.listIterator();
        while (en.hasNext()) {
            int i= (Integer)en.next();
            System.out.println(i);
            if (i%2==0) {
                i++;
                en.set(i);
            }
        }
        System.out.println();
        while (en.hasPrevious()) {
            System.out.print(en.previous()+" ");
        }
        // System.out.println(list);
    }
}