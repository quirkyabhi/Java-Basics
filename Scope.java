// import jdk.internal.org.jline.utils.Display;

/**
 * Scope
 */
public class Scope {

    static int deptCode=101;
    String deptName;
    void display(String deptHead){
        System.out.println("Deptcode: "+deptCode);
        System.out.println("DeptName: "+deptName);
        System.out.println("DeptHead: "+deptHead);
    }
    public static void main(String[] args) {
        Scope obj= new Scope();
        obj.deptName="IT";
        obj.display("deptHead");
    }
}