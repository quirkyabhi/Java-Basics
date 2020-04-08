import java.io.FileInputStream;

public class FileRead {
    public static void main(String[] args) {
        
        try {
            FileInputStream  file = new FileInputStream("file");
            int temp;
            while ((temp = file.read()) != -1) {
                System.out.print((char)temp);
            }
            file.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}