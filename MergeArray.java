import java.util.*;
class MergeArray
{
	public static void main(String args[])
	{
		int array[]={1,2,3,4,5};
		int odd[]=new int[array.length];
		odd[0]=1;
		odd[1]=3;
		odd[2]=3;
		int even[]=new int[array.length];
		even[0]={1};
		even[1]=2;
		
		int add[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			if(odd[i]==0)
			{
				continue;
			}
			add[i]=odd[i];
		}
		int j=0;
		for(int i=odd.length;i<add.length;i++)
		{
			add[i]=even[j];
			j++;
		}
		System.out.println(Arrays.toString(add));
	}
}