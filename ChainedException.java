import java.io.IOException;

class Account{
    public void login (String email , String pass) throws Exception {
        if (email==null||pass==null) {
            Exception ex = new Exception("Invalid Entry");
            IOException io = new IOException("Email or pass invalid");
            ex.initCause(io);
            throw ex;
        } else{
            System.out.println("Login Successful ");
        }
        
    }
}

/**
 * ChainedException
 */
public class ChainedException {

    public static void main(String[] args) {
        String email = "avi@gmail.com";
        // String pass= "hellohi";
        String pass= null;
        Account oAccount= new Account();
        try {
            oAccount.login(email, pass);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Cause : "+e);
            System.out.println("Actual Cause :  "+e.getCause());
        }
        
    }
}