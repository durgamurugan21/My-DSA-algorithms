import java.util.Scanner;
class  FindSumOfFourElements
{
	public static void main(String args[])
	{
		int array[]={4,6,8,7,2,9,4,8};
		System.out.println("enter the no to find the sum of nos in array");
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
			for(int i=0;i<array.length-3;i++)
			{
			  for(int j=i+1;j<array.length-2;j++)
			  {
					for(int k=j+1;k<array.length-1;k++)
					{
					  for(int l=k+1;l<array.length;l++)
						{
							if((array[i]+array[j]+array[k]+array[l])==sum)			  
							{								
							  System.out.println(array[i]+"+"+array[j]+"+"+array[k]+"+"+array[l]+"="+sum);
							}
						}
					}
			  }
			
			}
	}
	

}