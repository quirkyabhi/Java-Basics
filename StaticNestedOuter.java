// /**
//  * StaticNestedOuter
//  */
// public class StaticNestedOuter {
//     public int a=10;
//     static int b=15;
//     private int c=20;
//     void display(){
//         StaticNestedInner obj= new StaticNestedInner();
//         obj.print();
//     }
//     // static class StaticNestedInner {
//     class StaticNestedInner{
//         void print(){
//             System.out.println("a : "+a);
//             System.out.println("b : "+b);
//             System.out.println("c : "+c);
//         }
//     }
//     public static void main(String[] args) {
//         StaticNestedOuter outerObj = new StaticNestedOuter();
//         StaticNestedOuter.StaticNestedInner obj = outerObj.new StaticNestedInner();
//         obj.print();
        
//         outerObj.display();
//     }
// }



// 


/**
 * StaticNestedOuter local class
 */
public class StaticNestedOuter {
    public int a=10;
    static int b=15;
    private int c=20;
    void display(){

        class StaticNestedInner{
            void print(){
                System.out.println("a : "+a);
                System.out.println("b : "+b);
                System.out.println("c : "+c);
            }
        }
            StaticNestedInner obj= new StaticNestedInner();
            obj.print();
    }
    // static class StaticNestedInner {
    public static void main(String[] args) {
        StaticNestedOuter outerObj = new StaticNestedOuter();
        
        outerObj.display();
    }
}