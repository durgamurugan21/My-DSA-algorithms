import java.util.*;
class Overlappingnew
{
	public static void main(String args[])
	{
		//{1, 3}, {2, 6}, {8, 10}, {15, 18},{17,20}//{1, 3}, {5, 7}, {2, 4}, {6, 8}//{1, 3}, {7, 9}, {4, 6}, {10, 13}
		int array[][]=new int [][]{{1,3}, {2,4}, {5,7}, {6,8}};
		int temp[][]=new int[array.length][array[0].length];
		int row=0,col=0,j=0,i=0;
		 if(array[i][j+1]<array[i+1][j])
			{
				temp[row][col]=array[i][j];
				temp[row][col+1]=array[i][j+1];
				row++;
				i++;
			} 	
		for(;i<array.length-1;i++)
		{
			if(array[i][j+1]>array[i+1][j])
			{
				temp[row][col]=array[i][j];
				temp[row][col+1]=array[i+1][j+1];
				row++;
			}
			else if(array[i][j+1]!=temp[row-1][col+1])
			{
				temp[row][col]=array[i][j];
				temp[row][col+1]=array[i][j+1];
				row++;
			}
					
		}
		if(array[i][j+1]!=temp[row-1][col+1])
		{
			temp[row][col]=array[i][j];
			temp[row][col+1]=array[i][j+1];
		}
	 System.out.println(Arrays.deepToString(temp));
	}
}