import java.util.Scanner;
class Char
{
	public static void main(String args[])
	{
		String input;//durgadevi
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to check the occurrence");
		input=sc.nextLine();
		for(int i=0;i<input.length();i++)
		{
			char check=input.charAt(i);
			for(int j=i+1;j<input.length();j++)
			{
				char match=input.charAt(j);
				if(check==match)
					count++;
			}
			System.out.println("The word "  +check+ " occurred in " +count+ " times");
			count=1;
		}
		
	}
}