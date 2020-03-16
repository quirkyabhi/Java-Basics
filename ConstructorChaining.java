/**
 * ConstructorChaining
 */
// public class ConstructorChaining {
//     int x;
//     public  ConstructorChaining() {
//         System.out.println("Default");
        
//     }

//     public  ConstructorChaining(int n) {
//         this();
//         this.x=n;
//     }
//     public static void main(String[] args) {
//         ConstructorChaining obj= new ConstructorChaining(10);
//         System.out.println("x: "+obj.x); 
        
//     }
// }

/**
 * Base
 */
class Base {

    public  Base() {
        System.out.println("Base Default");
        
    }
}

public class ConstructorChaining extends Base{
    int x;
    public  ConstructorChaining() {
        // this(10);
        super();
        System.out.println("Child Default");
        
    }

    // public  ConstructorChaining(int n) {
        
    //     this.x=n;
    // }
    public static void main(String[] args) {
        ConstructorChaining obj= new ConstructorChaining();
        // System.out.println("x: "+obj.x); 
        
    }
}