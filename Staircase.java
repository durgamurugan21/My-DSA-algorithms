import java.util.*;
class Staircase
{
	public static void main(String args[])
	{
		System.out.println("enter the number to climp up steps : " );
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int climp[]=new int[n+1];
		climp[0]=1;
		int way[]=new int[]{1,3,5};
		int total,i;
		if(n<0)
			System.out.println("The number of unique ways to climp " +n+ "steps is 0" );
		else if(n==0)
			System.out.println("The number of unique ways to climp " +n+ "steps is 1 " );
		else
		{
			for( i=1;i<=n;i++)
			{   total=0;
				for(int j : way)
				{
					if(i-j>=0)
						total=total+climp[i-j];
						climp[i]=total;
				}
					System.out.println(climp[i]);
			}
		}
		System.out.println("The number of unique ways to climp " +n+ "steps is "+climp[n]);
	}	
}
/*
int arr[]=new int[n+1];
arr[0]=1;
arr[1]=1;
for(int i=2;i<arr.length;i++)
{
	arr[i]=arr[i-1]+arr[i-2];
}
sop(arr[n]);//	

//if n==0 return 1;
nums =new int[n+1]
nums[0]=1
for i ffrom i to n
total=0
foreach j in(1,3,5)
if i-j>=0
total=total+nums[i-j]
nums[i]=total   
*/





