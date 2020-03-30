// abstract class SumInner {
//     abstract int sum(int a, int b);
    
// }


// /**
//  * AnonymousDemo
//  */
// public class AnonymousDemo {

//     public static void main(String[] args) {
//         SumInner oInner = new SumInner(){
        
//             @Override
//             int sum(int a, int b) {
//                 // TODO Auto-generated method stub

//                 return a+b;
//             }
//         };
//         System.out.println("Sum is : "+ oInner.sum(10, 20));
//     }
// }

interface SumInner {
    public int sum(int a, int b);
    
}

/**
 * AnonymousDemo
 */
public class AnonymousDemo {

    public static void main(String[] args) {
        SumInner oInner = new SumInner(){
        
            @Override
            public int sum(int a, int b) {
                // TODO Auto-generated method stub

                return a+b;
            }
        };
        System.out.println("Sum is : "+ oInner.sum(10, 20));
    }
}

