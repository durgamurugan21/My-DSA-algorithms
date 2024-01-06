import java.util.Arrays;
class ReversesLetters
{
	public static void main(String args[])
	{
		String letters="durgadevi";
		int length=letters.length();
		String result="";
		for(int i=length-1;i>=0;i--)
		{
			result+=letters.charAt(i);
			
		}
		System.out.println(result);
	
	}
}