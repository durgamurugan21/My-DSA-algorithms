import java.util.*;
import java.lang.*;
class ReverseWords
{
	public static void main(String args[])
	{
		String word =new String("durga devi working hard");
	    String temp[]=new String[word.length()];
		int startindex=0,endindex=0,j=0;
			for(int i=0;i<word.length();i++)
			{
				char empty=word.charAt(i);
				if(empty==' ')
				{
				  endindex=i;
				  temp[j]=(word.substring(startindex,endindex));
				  startindex=endindex+1;
				  j++;	 
				}	
			}
		endindex=word.length();
		temp[j]=(word.substring(startindex,endindex));
		String local;
		int size=j;
		for(int i=0;i<=size;i++)
		{
			local=temp[i];
			temp[i]=temp[size];
			temp[size]=local;
			size--;
		}   
	   for(int i=0;i<=j;i++)
	    {	
	     System.out.println(temp[i]);
	    }
	
    }
}

 