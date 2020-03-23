/**
 * ThisDemo
 */
public class ThisDemo {

    public String name;
    public void display() {
        System.out.println("Name: "+this.name);
        
    }
    public ThisDemo retInstance(ThisDemo obj) {
        return obj;
        
    }
    public static void main(String[] args) {
        ThisDemo  obj1= new ThisDemo();
        obj1.name="Abhi";
        obj1.display();
        ThisDemo obj2= obj1.retInstance(obj1);
        System.out.println("Name : "+obj2.name);
    }
}