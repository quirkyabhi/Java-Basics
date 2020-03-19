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
        // TODO Auto-generated method stub
        System.out.println("GST");

    }

    @Override
    public void cusName() {
        // TODO Auto-generated method stub
        System.out.println("ABHi");

    }

    
}