import java.util.Scanner;
class Numberorder
{
	public static void main (String args[])
	{
	System.out.println("input number one: ");
	Scanner sc=new Scanner(System.in);
	int numberone=sc.nextInt();
	System.out.println("input number two: ");
	int numbertwo=sc.nextInt();
	System.out.println("input number three: ");
	int numberthree=sc.nextInt();
		if((numberone<=numbertwo)&&(numbertwo<=numberthree))
		{
			System.out.println("increaseing order" );
		}
		else if((numberone>numbertwo)&&(numbertwo>numberthree))
		{
			System.out.println("decreaseing order" );
		}
		else
		{
			System.out.println("Neither increasing or decreasing order");
		}
	}
}
