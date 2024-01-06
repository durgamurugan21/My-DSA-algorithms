import java.util.*;
class Product
{
	public static void main(String args[])
	{
		int array[]={1,2,3,4,5};
		int newarray[]=new int[array.length]; 
		int length=array.length;
		int temp=1;
		int j;
		for(int i=0;i<length;i++)
		{
			for( j=i+1;j<length;j++)
			{
				temp=temp*array[j];
				
			}
			if(i>0 && i<array.length)
				{
					for(int k=i-1;k>=0;k--)
					{
						temp=temp*array[k];
					}
				}
			newarray[i]=temp;
			temp=1;
		}
		System.out.println(Arrays.toString(newarray));
	}

}