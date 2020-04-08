import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class BufferedOutputStreamReader {
    public static void main(String[] args) {
        FileOutputStream file = null;
        BufferedOutputStream buffer = null;
        try{
            file = new FileOutputStream("file");
            buffer = new BufferedOutputStream(file) ;
            String str= "Hello example";
            byte[] b= str.getBytes();
            buffer.write(b);
            System.out.println("success");
            buffer.flush();
            file.close();
        }catch( Exception e){
            e.printStackTrace();
        }
    }
}