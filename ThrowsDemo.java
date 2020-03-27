class StudentData{
    int roll_no=101;
    String name="Abhi";
    public void getStudents() throws Exception {
        System.out.println("Roll no : "+ roll_no);
        System.out.println("Name :"+name);
        
    }
}

/**
 * ThrowsDemo
 */
public class ThrowsDemo {

    public static void main(String[] args) {
        StudentData oData = new StudentData();
        try {
            oData.getStudents();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}