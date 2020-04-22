
public class StudentPrio {
    public String studentName;
    public int rollNo;
    public StudentPrio(String studentName,int rollNo){
        this.rollNo = rollNo;
        this.studentName= studentName;
    }
    public String getName(){
        return this.studentName;
    }
}