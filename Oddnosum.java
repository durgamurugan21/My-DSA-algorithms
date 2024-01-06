import java.util.Scanner;
class Oddnosum
{
	public static void main(String args[])
	{
		System.out.println("input number of terms:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0,count=1;
		System.out.println("The odd numbers are: ");
		for(int i=0;count<=number;i++)
		{
			if(i%2!=0)
			{
				System.out.println( +i );
				sum=sum+i;
				count++;
			}

		}
	System.out.println("The sum of odd natural number upto "+number+ " term is: " +sum);
	}
}
