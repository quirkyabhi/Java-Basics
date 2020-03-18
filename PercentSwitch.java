import java.util.Scanner;

/**
 * PercentSwitch
 */
public class PercentSwitch {

    public static void main(String[] args) {
        int marks;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the day:  ");
        marks= sc.nextInt();
        switch (marks/10) {
            case 10:
            System.out.println("A+");
                break;
            case 9:
            System.out.println("A");
                break;
            case 8:
            System.out.println("A");
                break;
            case 7:
            System.out.println("A");
                break;
            case 6:
                System.out.println("A");
                break;
            case 5:
            System.out.println("A");
            break;
            case 4:
                System.out.println("A");
                break;
                default:
            System.out.println("No input/Wrong input");
                break;
        }
    }
        
}
