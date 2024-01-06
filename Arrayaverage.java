class Arrayaverage
{
    public static void main(String args[])
	{
		int array[]=new int[]{1,2,3,4,5};
		int sum=0;
	  for(int i=0;i<=array.length-1;i++)
		{
			sum=sum+array[i];
		}
		int avg=sum/array.length;
		System.out.println(+avg);

   }
}
