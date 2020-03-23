/**
 * Nvars
 */
public class Nvars {

    public void sum(int... num) {
        int sum =0;
        for (int n : num) {
            sum= sum+n;
            
        }
        System.out.println("Total: "+sum);
    }
    public static void main(String[] args) {
        Nvars obj = new Nvars();
        obj.sum(1,2,3);
        obj.sum(3434);
        obj.sum(78,87);
        obj.sum();
    }
}