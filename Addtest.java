import java.lang.*;
class Addtest
{
public static void main(String args[])
   {
	    String input="20+5"; 
			char arr[]=new char[input.length()];
		int calculate=0,value;
		int j=0;
		for(int i=0;i<input.length();i++)
		{
			value=input.charAt(i);
			if(Character.isDigit(value))
			{
				arr[j]=value;
				j++
				calculate+=value;
				System.out.println(calculate);
			}
		}
		System.out.println(calculate);
   }
}