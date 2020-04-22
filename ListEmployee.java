import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ListEmp {
    String name, dept, salary;
    int empID;
    public ListEmp(int empID, String name, String dept, String salary )
    {
        this.empID= empID;
        this.name= name;
        this.dept= dept;
        this.salary=salary;
    }
}

public class ListEmployee {
    public static void main(String[] args) {
        List<ListEmp> li = new ArrayList<ListEmp>();
        li.add(new ListEmp(1, "abhi","IT","60000"));
        li.add(new ListEmp(2, "abhijeet","IT","60000"));
        li.add(new ListEmp(3, "jeet","IT","60000"));

        Iterator itr = li.iterator();
        while (itr.hasNext()) {
            ListEmp emp = (ListEmp)(itr.next());
            System.out.println("id : "+emp.empID+" name : "+emp.name+" dept: "+emp.dept+" salary: "+emp.salary);
        }
    }

}