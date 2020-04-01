import java.io.FileWriter;

/**
 * FileWriterDemo
 */
public class FileWriterDemo {

    public static void main(String[] args) {
        String str=  "Sample Text ...";
        try {
            FileWriter oWriter = new FileWriter("writeFile");
            for (int i = 0; i < str.length(); i++) {
                oWriter.write(str.charAt(i));
            }    
            System.out.println("Created Successfully");
            // oWriter.flush();
            oWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
        
    }
}