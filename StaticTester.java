/**
 * StaticTester
 */
public class StaticTester {

    public static void main(String[] args) {
        StaticClass.i=5;
        for (int j = 0; j < StaticClass.i; j++) {
            StaticClass.print();
            
        }
    }
}