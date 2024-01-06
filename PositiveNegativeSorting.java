class PositiveNegativeSorting
{
	public static void main (String args[])
	{
		int array[]={8,3,-4,-3,6,7,2};
		int temp;	
		int size=array.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]<array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
				
		    }
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]);
		}
		
		
	}
} 
/*for(int i=size-1;i>=0;i--)
		{
			System.out.print(array[i]);
		}*/ 