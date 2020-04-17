import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DeserializeDemo {
    public static void main(String[] args) {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("test"));
            StudentData s= (StudentData)in.readObject();
            System.out.println("roll no : "+s.rollNo);
            System.out.println("name : "+s.name);
            System.out.println("branch : "+s.branch);
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}