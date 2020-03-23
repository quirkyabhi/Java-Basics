import java.util.ArrayList;

/**
 * Demo
 */
public class Demo extends OverriddeAnnotation {
    
    @Override
    public void display() {
        System.out.println("Child");
        
    }
    public static void main(String[] args) {
        
        Demo obj = new Demo();
        @SuppressWarnings("rawtypes")
        // @SuppressWarnings("unused")
        ArrayList array1 = new ArrayList();
        // SuppressWarnings("rawtype")
        // @SuppressWarnings("unchecked")
        // array1.add(101);
        // array1.add("abc");
        // System.out.println(array1);

        obj.print();
    }

    
}