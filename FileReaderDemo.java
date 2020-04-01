import java.io.FileReader;

/**
 * FileReaderDemo
 */
public class FileReaderDemo {

    public static void main(String[] args) {
        try{
            FileReader oReader = new FileReader("file");
            int temp;
            while ((temp=oReader.read() )!=-1){
                System.out.print((char)temp);
                
            }
            oReader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}