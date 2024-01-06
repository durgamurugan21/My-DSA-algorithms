import java.util.Scanner;
class MedianForWindows
{
	public static void main(String args[])
	{
		//test cases:{-1,5,13,8,2,3,3,1} {-1,-2,-3,4,8,9,7},{-4,1,-3,7,8,9,4,-4,2,-3},{1,4,2}
		int array[]={-1,-2,-3,4,8,9,7};
		//getting window size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the windows size : ");
		int windowsize=sc.nextInt();
		//needed variables
		int count=0,temp=0,median=0;
		int midpoint = windowsize/2; //for find the median
		int i=0;
		//iterating over the given array
		while(i<=array.length-windowsize)
		{
			int temparr[]=new int[windowsize]; //temp array for split the array based on windowsize
			count=i;
			//store the array elements into temp array in given window size
			for(int k=0;k<temparr.length && count<array.length;k++)
			{
				temparr[k]=array[count];
				count++;
			}
			//printing the unsorted temp array
			for(int z=0;z<temparr.length;z++)
			{
				System.out.print(+temparr[z]+" ");
			}
			//sorting temp array
			for(int x=0;x<temparr.length;x++)
			{
				for(int y=x+1;y<temparr.length;y++)
				{
					if(temparr[x]>temparr[y])
					{
						temp=temparr[x];
						temparr[x]=temparr[y];
						temparr[y]=temp;
					}
				}
			}
			//storing to median by temp arr midpoint
			median=temparr[midpoint];
			System.out.println("	median is -> " +median);  //printing median
			i++;
		}	
	   }
}

