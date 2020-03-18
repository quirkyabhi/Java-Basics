/**
 * StudentInformation
 */
public class StudentInformation {

    public static void main(String[] args) {
        StudentDetails stu1= new StudentDetails();
        stu1.setName("Abhi");
        stu1.setRollno(101);
        StudentDetails stu2= new StudentDetails();
        stu2.setName("jeet");
        stu2.setRollno(102);
        System.out.println("Student details----- ");
        System.out.println("Roll no: "+stu1.getRollno());
        System.out.println("Name: "+stu1.getName());
        
        System.out.println("Roll no: "+stu2.getRollno());
        System.out.println("Name: "+stu2.getName());
        
        
    }
}