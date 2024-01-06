public class Clockwise 
{
    public static void main(String args[])
    {
		int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,112}};
		printSpiral(arr);
    }
    public static void printSpiral(int arr[][])
    {
		//System.out.print(arr.length);
		//System.out.print(arr[0].length);
    if(arr.length==0||arr[0].length==0)
	{
        return;
		
	}
    int top=0,left=0,right=arr[0].length-1,bottom=arr.length-1;
    while(top<=bottom&&left<=right)
            {
                 for(int i=left;i<=right;i++)
                {
                    System.out.print(arr[top][i]+"");
                }
                top++;
             
                for(int i=top;i<=bottom;++i)
                {
                    System.out.print(arr[i][right]+"");
                } 
                right--; 
                      
                for(int i=right;i>=left;--i)
                {
                    System.out.print(arr[bottom][i]);
                }
                bottom--;
                               
                for(int i=bottom;i>=top;--i)
                {
                    System.out.print(arr[i][left]+"");
                }
                left++;                                   
            }
    }
}
