import java.util.Scanner;

public class Adddigit
{
	
public static void main(String args[])
	
{
		
System.out.println("Enter the integer numbers between 0 to 1000 :");
		
Scanner sc=new Scanner(System.in);
		
int number=sc.nextInt();
	    
int sum=0;
			
if(number<=1000)
{
				
while(number>0)
{
				
int m=number%10;
				
sum=sum+m;
				
number=number/10;
				
}
			  
System.out.println(+sum);
          
 }
   
 }
}
