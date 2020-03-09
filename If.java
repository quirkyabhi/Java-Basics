/**
 * If
 */
public class If {

    public static void main(String[] args) {
        int a=4, b=5, c=8;
        if (a>b) {
            System.out.println("a is greater");
            if (a>c) {
                System.out.println("a is greater");
                
            } else if(c>a) {
                System.out.println("c is greater");
                
            }
        }
        else if (b>a){
            System.out.println("b is greater");
            if (b>c) {
                System.out.println("b is greater");
            } else if(c>b){
                System.out.println("c is greater");
                
            }
            else{
                System.out.println("equal");
            }
        }
        else{
            System.out.println("Equal");
        }

    }
}