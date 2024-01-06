import java.util.Scanner;
class SumPairSortedRotated 
{
	public static void main(String args[])
	{
		int array[] = {4,5,1,2,3}; 
        int size = array.length; 
		System.out.println("Enter the sum to find the pair:");
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		for	(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(sum==array[i]+array[j])
				{
					System.out.println("The sum value (" +sum+") pair is="+array[i]+"+"+array[j]);
				}
			}
		}
		
			
	}
}