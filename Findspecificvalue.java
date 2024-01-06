import java.util.Scanner;
class Findspecificvalue
{
	public static void main(String args[])
	{
		int array[]=new int[]{1,2,3,4,5};
		int i=0;
		System.out.println("Enter the number to find it is placed in array: ");
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int value=sc.nextInt();
		while(i<array.length)
		{
		   if(value==array[i])
			{
				flag=true;
			}
		i++;
		}
		if(flag==false)
		{
			System.out.println("the value is not present in array");
		}
		else
		{
			System.out.println("the value is present in array");
		}

	}
}

