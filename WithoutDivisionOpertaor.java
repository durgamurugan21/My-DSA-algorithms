import java.util.Scanner;
class WithoutDivisionOpertaor
{
	public static void main(String args[])
	{
		//needed variables
		int numerator,denominator,ans=0,reminder=0,quotient=0;
		Scanner sc=new Scanner(System.in);
		//getting input values
		System.out.println("Enter the numerator");
		numerator=sc.nextInt();
		System.out.println("Enter the denominator");
		denominator=sc.nextInt();
		//iterating loop for check the numerator is multiples of denominator
		for(int i=1;i<=numerator;i++)
		{
			ans=denominator*i;
			if(ans<=numerator)
			{
				quotient=i;
				reminder=numerator-ans; //getting the reminder value  
			}
			else if(ans>numerator)//if ans is greater then numerator exit the loop
			{
				break;
			}
		}
		//print the result
		System.out.println("Answer for " +numerator+ " divided by" +denominator+  " quotient is:" +quotient+ ", reminder is :" +reminder);
		

	}

}


10/5 =2