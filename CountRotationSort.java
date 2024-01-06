class CountRotationSort
{    
    public static void main (String[] args)  
    { 
        int array[] = {4,5,1,2,3}; 
        int size = array.length; 
		int min=array[0];
		int index=-1;
		for(int i=0;i<size;i++)
		{	if(min > array[i])
			{
				min=array[i];
				index=i;				
			}
		}
		System.out.println("count = " +index);        
    } 
}