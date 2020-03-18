/**
 * SavingsAccount
 */
public class SavingsAccount extends Bank{
    public float savingInterest=1.0f;
    public static void main(String[] args) {
        SavingsAccount obj= new SavingsAccount();
        System.out.println("Bank Name  :"+ obj.bank_name);
        System.out.println("Total Interest: "+ (obj.Interest+obj.savingInterest));
    }

    
}