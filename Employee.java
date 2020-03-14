/**
 * Constructor
 */
public class Employee {
    int empCode;
    int deptCode;
    String firstName;
    String lastName;
    Employee(){
         
    }
    Employee(int eCode, String fName, String lName){
        this.deptCode=101;
        this.empCode=eCode;
        this.firstName=fName;
        this.lastName=lName;
    }

    Employee(Employee e){
        this.deptCode=101;
        this.empCode=e.empCode;
        this.firstName=e.firstName;
        this.lastName=e.lastName;
    }
}