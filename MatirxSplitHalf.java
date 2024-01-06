import java.util.Scanner;
import java.util.Arrays;
class MatirxSplitHalf
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int row,col;
		System.out.println("Enter the row and column value");
		System.out.println("Enter the row size : ");
		row=scan.nextInt();
		System.out.println("Enter the column size : ");
		col=scan.nextInt();
		int array[][]=new int[row][col];
		//{{10,5,4},{12,8,14},{1,3,18}};
		System.out.println("Enter the  elements in the " +row+","+col+" array :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" ");
				array[i][j]=scan.nextInt(); 
				
				
			}
			System.out.println();
		}

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{	//i==1&&j==1||
					if(i==0||j==0||row-1==i||col-1==j)
					{
						
						array[i][j]=array[i][j]-(array[i][j]/2);
					}
					else
					{
						array[i][j]=2*array[i][j];
					}
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
		System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}