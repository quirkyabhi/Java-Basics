import java.util.Scanner;

/**
 * SavingAccount
 */
public class SavingAccount extends Accounts{

    float SavingInterest= 1.5f;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user =  input.next();

        // Accounts obj = new Accounts();
        SavingAccount sa= new SavingAccount();
        sa.WelcomeUser(user);
        System.out.println(" your total interest will be: ");
        System.out.println(" Basic interest : "+ sa.BasicInterest);
        System.out.println(" Basic interest : "+ sa.SavingInterest);
    }
}