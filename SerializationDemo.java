import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * SerializationDemo
 */
public class SerializationDemo {

    public static void main(String[] args) {
        StudentData s1 = new StudentData(101,"Abhi", "CSE");
        try{
            FileOutputStream fout= new FileOutputStream("test");
            ObjectOutputStream out= new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}