 import java.util.*;
class ZerosAndOnes
{
	public static void main(String args[])
	{
		int array[]={1,0,0,1,1,0,1,0,1};
		int count=0;
		int size=array.length;
		for(int i=0;i<size;i++)
		{	
		if(array[i]==0)
			count++;
		}	 
		for(int i=0;i<count;i++)				
		{
				array[i]=0;			
		}
		for(int i=count;i<size;i++)				
		{
				array[i]=1;			
		}		
		
		System.out.print(Arrays.toString(array));
    }
}
		

