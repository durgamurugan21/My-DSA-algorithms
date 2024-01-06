class SortMaxMin
{
	public static void main(String args[])
	{
	   int array[]={10,20,30,40,50,60,70,80,90,100};
		int temp;
		int size=array.length;			
       		
		for(int i=0;i<=size-1;i++)
		{
			for(int j=i+1;j<size;j++)				
			{
				if(i%2==0)
				{
					if(array[i]<array[j]){
					   temp=array[i];
						array[i]=array[j];
						array[j]=temp;	
					}
						
				}
				else if(i%2!=0)
				{
					if(array[i]>array[j])
					{	temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
		}
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}
	}
}