public class ClockwiseSpiral
{
	public static void main(String args[])
	{
		int array[][]={{1,2,3},{4,5,6},{7,8,9}};
		printSpiral(array);
	}
	public static void printSpiral(int array[][])
	{
		if(array.length==0 || array[0].length==0)
		{return;}
		int top=0,left=0,right=array[0].length-1,bottom=array.length-1;
		while(top<=bottom&&left<=right)
		{
		for(int i=left;i<=right;i++)
		{
			System.out.print(array[top][i]+"");
		}
		++top;
		for(int i=top;i<=bottom;++i)
		{
			System.out.print(array[i][right]+"");
		}
		--right;
		for(int i=right;i>=left;--i)
		{
			System.out.print(array[bottom][i]);
		} 
		-–bottom;
		for(int i=bottom;i>=top;--i)
		{
			System.out.print(array[i][left]+"");
		}
		++left;
		}
	}
}
