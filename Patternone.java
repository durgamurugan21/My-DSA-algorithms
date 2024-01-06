import java.util.*;
class Patternone
{
	public static void main(String args[])
	{
		System.out.println("Enter the row size:");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("Enter the column size:");
		int col=sc.nextInt();
		int one=1,space=1;
			for(int i=0;i<row;i++)
			{
				for(int k=0;k<space;k++)
				{
					System.out.print(" ");
				}
					for(int j=i;j<col;j++)
					{ 
						System.out.print(one);
					}
				
					col=col-1;
					space++;
					System.out.println(); 
		    }
	}
}
