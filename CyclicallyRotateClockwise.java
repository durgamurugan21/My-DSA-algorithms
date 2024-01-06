class  CyclicallyRotateClockwise  
{
	public static void main(String args[])
	{
		int array[]=new int[]{1,2,3,4,5};
		int size=array.length;
		int temp,j;
		for(int i=0;i<size;i++)
		{
			temp=array[i];
			array[i]=array[size-1];
			array[size-1]=temp;
		}
	/*	for(int i=0;i<=0;i++)
		{
			for(j=i+1;j<size;j++)
			{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		    }
		}*/
				
		for(int x=0;x<size;x++)
		{
			System.out.print(array[x]);
		}
	
	}
}