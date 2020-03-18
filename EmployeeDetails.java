/**
 * EmployeeDetails
 */
public class EmployeeDetails {

    public static void main(String[] args) {

        Employee emp1= new Employee(101,"Nishant","Mishra");
        Employee emp2= new Employee(102,"Abhi","Jeet");
        Employee emp3= new Employee(emp2);
        System.out.println("Employee Details : \n"+ emp1.deptCode+"\n" +emp1.empCode+"\n" + emp1.firstName+"\n" + emp1.lastName);
        System.out.println("");
        System.out.println("Employee Details : \n"+ emp2.deptCode+"\n" +emp2.empCode+"\n" + emp2.firstName+"\n" + emp2.lastName);
        System.out.println("");
        System.out.println("Employee Details : \n"+ emp3.deptCode+"\n" +emp3.empCode+"\n" + emp3.firstName+"\n" + emp3.lastName);
    }
}