/**
 * StoreImplementation
 */
public class StoreImplementation extends StoreApp {
    public static void main(String[] args) {
        StoreImplementation obj= new StoreImplementation();
        obj.login();
        obj.payment();
    }

    @Override
    public void login() {
        System.out.println("loginnnn");

    }

    @Override
    public void payment() {
        System.out.println("paymentttt");

    }

    
}