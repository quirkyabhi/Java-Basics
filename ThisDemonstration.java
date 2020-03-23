/**
 * ThisDemonstration
 */
public class ThisDemonstration {

    int i;
    public void printValue(ThisDemonstration obj) {
        System.out.println(obj.i);
        
    }
    public void callPrint() {
        printValue(this);
    }
    public static void main(String[] args) {
        
        ThisDemonstration obj= new ThisDemonstration();
        obj.i =5;
        obj.callPrint();
    }
}