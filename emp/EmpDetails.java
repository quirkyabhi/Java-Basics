package emp;
import dept.DeptDetails;
/**
 * EmpDetails
 */
public class EmpDetails extends DeptDetails {
    public static void main(String[] args) {
        EmpDetails emp= new EmpDetails();
        System.out.println("ID : "+emp.dept_id);
        System.out.println("Name : "+emp.deptName);
        // System.out.println("HOD : "+emp.hod);

    }

    
}

