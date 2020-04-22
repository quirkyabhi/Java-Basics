
import java.util.Scanner;
class TestClass {
public static void main(String[] args) {
int A,B,N;
int rem=0;
int day_to_reach=0;
Scanner scan=new Scanner(System.in);

A=scan.nextInt();
B=scan.nextInt();
N=scan.nextInt();

if(A<N)
{
rem=N-(A-B);
day_to_reach++;
}
if(rem<A)
{
day_to_reach++;
rem=0;
}
while(rem>A)
{
rem=N-(A-B);
day_to_reach++;
}
System.out.println(day_to_reach);
}

}

