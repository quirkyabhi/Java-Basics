import java.io.FileReader;
import java.io.FileWriter;

/**
 * FileCopy
 */
public class FileCopy {

    public static void main(String[] args) {
        try{
            FileReader oReader= new FileReader("file");
            FileWriter oWriter= new FileWriter("writeFile");

            int temp;
            while ((temp=oReader.read() )!=-1){
                oWriter.write(temp);
            }
            oReader.close();
            oWriter.close();
        } catch(Exception e){
            e.printStackTrace();
        }  
    }
}