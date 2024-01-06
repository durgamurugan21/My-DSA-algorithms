class ArrayMixedMaxMinSort
{
	public static void main(String args[])
	{
	    int array[]={10,20,30,40,50,60,70,80,90,100};
		int temparray[]=new int[array.length];	
		int size=array.length;			
       	int j=size-1;	
		for(int i=0;i<=size-1;i++)
		{							
			if(i%2==0)
			{				    
				temparray[i]=array[j];	
				j--;				
			}			
		}
		int x=0;
		for(int k=1;k<=size-1;k++)
		{			
				
			if(k%2!=0)
			{				    
				temparray[k]=array[x];
				x++;				
			}			
		}
			
		for(int k=0;k<temparray.length;k++)
		{
			System.out.print(temparray[k]+" ");
		}	
	}
}