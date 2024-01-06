 import java.util.*;
import java.lang.*;
class ZigzagString
{
	public static void main (String args[])
	{
		String name="thisisazigzagarray";
		System.out.println("Enter the number to print the lines");
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		int l=name.length();
		char print[][]=new char[k][l];
			int up=k-2,down=0;
			for(int j=0;j<l;j++)
			{
				char letter=name.charAt(j);
				if(down<=k-1)
				{
					print[down][j]=letter;
					down++;
					if(down==k-1)
						up=k-2;
				}
				else if(down>k-1 && up>0)
				{
					print[up][j]=letter;
					up--;
					if(up==0)
					down=0;
				}
			}
		
		for(int i = 0; i<k; i++)
		{
			for(int j = 0; j<l; j++)
			{
				System.out.print(print[i][j]);
			}
		 System.out.println();
       }
	}
}
