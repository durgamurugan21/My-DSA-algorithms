import java.util.Scanner;
class Indexofanarray
{
	public static void main (String args[])
	{
		System.out.println("enter the element to check index of array");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int array[]=new int[]{6,3,5,1,4};
		int index=0;
		for(int i=0;i<array.length;i++)
		{
			if(number==array[i])
			{
				index=i;
			}
		}
	 System.out.println("Index of " +number+ " is " +index );

	}
}
