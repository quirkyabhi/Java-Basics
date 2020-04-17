import java.io.Serializable;

public class StudentData implements Serializable{
    int rollNo;
    String name;
    String branch;
    public StudentData (int r, String n, String b) {
        this.rollNo=r;
        this.name=n;
        this.branch=b;
    }
}