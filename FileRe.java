import java.io.*;

public class FileRe {
    public static void main(String[] args) {
        FileInputStream file= null;
        try {
            file = new FileInputStream("file");
            int temp;
            while ((temp=file.read())!=-1) {
                System.out.print((char)temp);
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

}