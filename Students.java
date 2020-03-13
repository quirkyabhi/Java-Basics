/**
 * ClassObj
 */
public class Students {
    String name;
    int roll_no;
    char section;
    public static void main(String[] args) {
        Students  obj1= new Students();
        obj1.name="Abhi";
        obj1.roll_no= 02;
        obj1.section='A';
        
        System.out.println("Roll no : "+ obj1.roll_no);
        System.out.println("Name : "+ obj1.name);
        System.out.println("Section : "+ obj1.section);
        
        Students  obj2= new Students();
        obj2.name="Avi";
        obj2.roll_no= 03;
        obj.section='A';
        
        System.out.println("Name : "+ obj2.name);
        System.out.println("Roll mo : "+ obj2.roll_no);
        System.out.println("Section : "+ obj2.section);

        
    }
}