class ConsecutiveElement
{
	public static void main(String args[])
	{
		int array[]=new int[]{1,2,3,4,5,96,97,98,99};
		int count=0,maxvalue,maxindex;
		int indexstart;

			for(int i=0;i<array.length-1;i++)
			{
				if(array[i]==array[i+1]+1)
				{
				count++;
				}
			}
			
		maxvalue=count;
		maxindex=array[count];
		System.out.println(array[count]);
		/*indexstart=
		System.out.println(maxindex-maxvalue-1);
		
		int out[]=new int[count];
			for(i=maxcount;i>=maxcount;i--)
				
				{
					int out[i]=
				}
			
			//for()*/
			
	}

}
