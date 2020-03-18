/**
 * Student
 */
public class Student extends Department{

    public  String student_name="Abhijeet";
    public int Student_rollno=2011;
    public static void main(String[] args) {
        Student obj= new Student();
        System.out.println("Student Details: \nRoll no: "+obj.Student_rollno);
        System.out.println("Name: "+ obj.student_name);
        System.out.println("College Name: "+ obj.clg_name);
        System.out.println("Dept name :"+ obj.dept_name);
        System.out.println("Dept code :"+ obj.dept_code);
    }
}