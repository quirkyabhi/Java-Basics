/**
 * Constant
 */
public class Constant {
    static String name = "abhi";

    // static final String name = "abhi"; // error cuz final makes the string
    // constant
    public static void main(String[] args) {
        System.out.println("Name =" + name);
        name = "abhijeet";
        System.out.println("Name =" + name);

    }
}