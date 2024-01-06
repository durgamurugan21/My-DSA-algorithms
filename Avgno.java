import java.util.Scanner;
class Avgno
{
	public static void main(String args[])
	{
		System.out.println("input number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(); 
		int sum=0;
		System.out.println("input the " +number+ " numbers");
			for(int i=1;i<=number;i++)
			{
			System.out.println(+i);
			sum=sum+i;
			}
		System.out.println("Sum of "+number+ "no is :" +sum);
		int avg=sum/number;
		System.out.println("The average is :" +avg);
	}

}
