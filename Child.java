/**
 * Child
 */
public class Child extends Base{
    public void print() {
        System.out.println("Child class print method");
        
    }
    public void print(String name) {
        System.out.println("Hello : "+name);
        
    }
    public static void main(String[] args) {
        Child obj= new Child();
        obj.print();
        obj.print("Abhijeet");
    }

    
}