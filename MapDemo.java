import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(101, "arg1");
        students.put(102, "22");
        students.put(103,null);
        students.put(null,"abhi");

        String student = students.get(101);
        System.out.println("student of roll no 101 : "+ student);

        student = students.getOrDefault(104, "No student");
        System.out.println("student of roll no 104 : "+ student);

        boolean isRollNoPresent=students.containsKey(105);
        boolean isStudentPresent= students.containsValue("arg0");
        boolean isStudentPresent2= students.containsValue("arg1");

        System.out.println("Roll no is present :" + isRollNoPresent);
        System.out.println("student present :" + isStudentPresent);
        System.out.println("student present :" + isStudentPresent2);

        Set studentsSet = students.entrySet();
        Iterator itr = studentsSet.iterator();
        while (itr.hasNext()) {
            Map.Entry entry =(Map.Entry)itr.next();

            System.out.println("Roll no : "+entry.getKey()+" Name : "+entry.getValue());
        }



    }
}