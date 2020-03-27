class Divide{
    
    public int divide(int a, int b) throws ArithmeticException{
        if (b==0) {
            throw new ArithmeticException("Input can't be zero");
        }
        return a/b;
    }
}

/**
 * ThrowsDivision
 */
public class ThrowsDivision {

    public static void main(String[] args) {
        Divide oDivide = new Divide();
        try {
            System.out.println(oDivide.divide(5,0));
        } catch (ArithmeticException e) {
            //TODO: handle exception
            e.printStackTrace();
            // System.out.println(e);
        }
        System.out.println("test doneee");
    }
}