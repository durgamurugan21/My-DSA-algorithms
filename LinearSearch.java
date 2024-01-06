class CountRotationSort
{    
    public static void main (String[] args)  
    { 
        int array[] = {3,4,5,2,2}; 
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