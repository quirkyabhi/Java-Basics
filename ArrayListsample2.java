import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListsample2 {
    public static void main(String[] args) {
        ArrayList list= new ArrayList();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
        System.out.println("List is : "+list);
        
        Iterator it= list.iterator();
        while (it.hasNext()) {
            if ((int)(it.next())%2!=0) {
                it.remove();
            }
        }
        System.out.println("Updated list "+list);
        
    
    }
}