/**
 * ConstructorChaining
 */
public class ConstructorChaining {
    int x;
    public  ConstructorChaining() {
        System.out.println("Default");
        
    }

    public  ConstructorChaining(int n) {
        this();
        this.x=n;
    }
    public static void main(String[] args) {
        ConstructorChaining obj= new ConstructorChaining(10);
        System.out.println("x: "+obj.x); 
        
    }
}