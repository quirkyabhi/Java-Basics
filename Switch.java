import java.util.Scanner;

/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        String day="";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the day:  ");
        day= sc.next();
        switch (day) {
            case "Monday":
            System.out.println("Monday");
                break;
            case "Tuesday":
            System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            
            default:
            System.out.println("No input/Wrong input");
                break;
            // sc.close();
        }
    }
}