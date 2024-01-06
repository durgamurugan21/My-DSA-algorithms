import java.util.*;
class ReplaceNextGreatestNumber 
{ 
	public static void main(String args[])
	{
		int array[]={45,20,100,23,-5,2,-6};
		int size=array.length;
		int max,i;
		for( i=1;i<size;i++)
		{
			max=array[i];
			for(int j=i+1;j<size;j++)
			{
				if(max<array[j])
				{
					max=array[j];			
				}
			}
			array[i]=max;
			//x++;
		}
		array[i-1]=-1;
		System.out.println(Arrays.toString(array));
	
	}

}
 