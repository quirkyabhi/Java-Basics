/**
 * CurrentAccount
 */
public class CurrentAccount extends Bank {

    public float currentInterest=1.5f;
    public static void main(String[] args) {
        CurrentAccount obj= new CurrentAccount();
        System.out.println("Bank Name  :"+ obj.bank_name);
        System.out.println("Total Interest: "+ (obj.Interest+obj.currentInterest));
    }
}