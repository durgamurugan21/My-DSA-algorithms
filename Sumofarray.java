class Sumofarray
{
	public static void main(String args[])
	{
		int array[]=new int[] {1,2,3,4,5};
		int sum=0;
		int arraylength=array.length;
			for(int i=0;i<=arraylength-1;i++)
			{
			sum=sum+array[i];
			}
		System.out.println(+sum);
	}
}
