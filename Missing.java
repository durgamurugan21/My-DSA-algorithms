import java.util.*;
class Missing
{
	public static void main(String args[])
	{
		int arr[]={11,15,13,12};
		Arrays.sort(arr);
		int missno=0;
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1!=arr[i+1])
			{
				missno=arr[i+1]-1;
				System.out.println("the missing no is "+missno);
			}
		}
	}
}