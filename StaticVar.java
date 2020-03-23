/**
 * StaticVar
 */
public class StaticVar {
    static int deptCode=5001;
    int rollNo;
    String name;
    public static void print() {
        System.out.println("STATIC");
        
    }
    static{
        System.out.println("THIS IS STATIC BLOCK");
    }

    public static void main(String[] args) {
        StaticVar obj1= new StaticVar();
        obj1.rollNo=101;
        obj1.name="Abhi";
        
        StaticVar obj2= new StaticVar();
        obj2.rollNo=102;
        obj2.name="Jeet";
        
        StaticVar obj3= new StaticVar();
        obj3.rollNo=103;
        obj3.name="Abhijeet";

        System.out.println("First student details");
        System.out.println("Dept Code: "+ deptCode);
        System.out.println("Roll no: "+obj1.rollNo);
        System.out.println("Name: "+ obj1.name);

        System.out.println("Second student details");
        System.out.println("Dept Code: "+ deptCode);
        System.out.println("Roll no: "+obj2.rollNo);
        System.out.println("Name: "+ obj2.name);

        System.out.println("Third student details");
        System.out.println("Dept Code: "+ deptCode);
        System.out.println("Roll no: "+obj3.rollNo);
        System.out.println("Name: "+ obj3.name);

        print();
        
    }
}