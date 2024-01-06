import java.util.Scanner;
class Positiveornegative
{
	public static void main(String args[])
	{
	System.out.println("Enter the number to find postive or negative");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if(number>0)
	{
	System.out.println("The given number " +number+ "is postive");
	}
	else if(number<0)
	{
	System.out.println("The given number " +number+ "is negative");
	}
	else
	{
	System.out.println("The given number " +number+ "is neither postive nor negative");
	}
	}
}


n=1 if  m>0 
n=0 if  m=0
n=-1 if m<0