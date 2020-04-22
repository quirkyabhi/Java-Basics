import java.util.Scanner;
public class Ladderque {
    public static void main(String args[] ) throws Exception {
        double totalHeight;
        double uptSteps;
        double downSteps;
        double needed;

        Scanner scan= new Scanner(System.in);
        System.out.print("Upsteps : ");
        uptSteps= scan.nextDouble();
        System.out.print("downsteps : ");
        downSteps= scan.nextDouble();
        System.out.print("total height : ");
        totalHeight= scan.nextDouble();
        double finalHeight= totalHeight-uptSteps;
        double oneGo= uptSteps-downSteps;
        needed= Math.ceil(finalHeight / oneGo + 1);
        System.out.println("ans is : "+(int)needed);
        scan.close();
        
    }
}