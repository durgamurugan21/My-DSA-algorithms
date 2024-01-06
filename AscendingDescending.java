import java.util.*;
class AscendingDescending
{
	public static void main(String args[])
	{
		int array[]={1,5,3,7,8,2};
		System.out.println("Enter 1 for ascending and 2 for descending array");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int temp=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
		}
		if(input==1)
		{
			for(int i=0;i<=array.length;i++)
			{
			System.out.print(array[i]+" ");
			}
		}
		else if(input==2)
		{
			for(int i=array.length-1;i>=0;i--)
			{
			System.out.print(array[i]+" ");
			}
		
		}
		else
		{
			System.out.println("pleasse enter the valid input");
		}
	}
} 