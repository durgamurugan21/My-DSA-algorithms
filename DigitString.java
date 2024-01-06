import java.util.*;
class DigitString
{
	public static void main(String[] args)
	{
		int arr[]=new int[]{2,3};
		String str[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		char[] output=new char[arr.length];
		System.out.println(str[arr[0]].length());
		System.out.println(arr.length);
		 //System.out.println(str[2].length());
		mapping(0,str,arr,output);
	}
	public static void mapping(int digit,String[] str,int[] arr,char[] output)
	{
		if(digit==arr.length)
		{
			System.out.println(output);
			return;
		}
		for(int i=0;i<str[arr[digit]].length();i++)
		{
			output[digit]=str[arr[digit]].charAt(i)	;
			System.out.println(output[digit]);
			mapping(digit+1,str,arr,output); 
		}
		return;
	}
}
