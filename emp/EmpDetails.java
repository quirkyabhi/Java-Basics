package emp;
import Dept.DeptDetails;
/**
 * EmpDetails
 */
public class EmpDetails extends dept.DeptDetails {
    public static void main(String[] args) {
        EmpDetails emp= new EmpDetails();
        System.out.println("ID : "+emp.dept_id);
        System.out.println("Name : "+emp.deptName);
        // System.out.println("HOD : "+emp.hod);

    }

    
}

