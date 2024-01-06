import java.util.Arrays;
import java.util.Scanner;
class Findelement
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the k th position ");
		int val=sc.nextInt();
		int array1[]={100,112,256,349,770};
		int array2[]={72,86,113,119,265,445,892};
		int count=array1.length+array2.length;
		int temp;
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]>array2[j])
				{
					temp=array1[i];
					array1[i]=array2[j];
					array2[j]=temp;
				}
			}	
		}
		for(int k=0;k<array2.length-1;k++)
		{
			for(int j=k+1;j<array2.length;j++)
			{
				if(array2[k]>array2[j])
				{
					temp=array2[k];
					array2[k]=array2[j];
					array2[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(count);
		if(val<=array1.length)
		{
			System.out.println("the k th position is "+array1[val-1]);
		}
		else if(val<=count)
		{
			System.out.println("the k th position is "+array2[(val-array1.length)-1]);	
		}

	}


}