
import java.util.Scanner;

public class CubeNumber
{
public static void main(String args[])
    {
int sum=0;
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
   int x =i*i*i;  
    sum=sum+x;     
}
   System.out.println("The cube value of"+n+"is =" +sum);
    
    }
}