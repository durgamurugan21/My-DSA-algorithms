class Stair
{
	public static void main (String args[])
	{
		int n=5;
		int arr[]={1,3,5};
		int fstep,sstep;
		int total=0,i=0;
		while(i<=arr.length)
		{
		fstep=n-1;
			if(fstep <0)
			{
				fstep=0;
			}
		total=total+fstep;
		fstep=0;
		sstep=0;
		i++;
		}
		System.out.println("total ways to reach the nth stair is " +total);
	}
}