/**
 * EmployeeDetails
 */
public class EmployeeDetails {

    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.firstName="Nishant";
        emp.lastName="Mishra";
        System.out.println("Employee Details : \n"+ emp.empCode+"\n" +emp.deptCode+"\n" + emp.firstName+"\n" + emp.lastName);

    }
}