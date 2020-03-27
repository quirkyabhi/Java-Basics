import java.io.BufferedReader;
import java.io.FileReader;

/**
 * ExceptionResource
 */
public class ExceptionResource {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file"))) {
            String str;
            while ((str=br.readLine())!=null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            // System.out.println(e);
            e.printStackTrace();
            //TODO: handle exception
        }
        System.out.println("After eexception!!");
    }
}