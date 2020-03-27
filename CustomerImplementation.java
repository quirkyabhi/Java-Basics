/**
 * CustomerImplementation
 */
public class CustomerImplementation implements Customer{

    public static void main(String[] args) {
        CustomerImplementation obj = new CustomerImplementation();
        obj.cusName();
        obj.gstRate();
    }

    @Override
    public void gstRate() {
    
        System.out.println("GST");

    }

    @Override
    public void cusName() {
        
        System.out.println("ABHi");

    }

    
}