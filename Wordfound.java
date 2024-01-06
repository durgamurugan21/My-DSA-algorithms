import java.util.Scanner;
class Wordfound
{
	public static void main(String args[])
	{
		/*{'f','a','c','i'}
		  {'o','b','q','p'}
		  {'a','n','o','p'},
		  {'m','a','s','s'}*/
		char array[][]=new char[][]{{'f','a','c','i'},{'o','b','q','p'},{'a','n','o','p'},{'m','a','s','s'}};
		System.out.println("Enter the word to check");
		Scanner s=new Scanner(System.in);
		String search=s.next();
		String word="";
		int count=0,cons=0,w=0,i,j,x;
		while(w<array.length)
		{
			for(i=0;i<array.length;i++)
            {
				word +=array[cons][i];
				
				if(search.equals(word))
				{ 
					count++;
				}
				
			}
			cons++;
			word="";
			w++;
		}
		 
		 cons=0;
		 w=0;
		while(w<array[0].length)
		{
			for(i=0;i<array.length;i++)
            {
				word +=array[i][cons];
				
				if(search.equals(word))
				{ 
					count++;
				}
			}
			cons++;
			word="";
			w++;
		}
	for(x=0;x<array.length;x++)
        {
			i=x;
			j=0;
				while(i>=0)
				{										  
					word=word+array[i][j];
					if(search.equals(word))
					{
						count++;	
					}
					i=i-1;
					j=j+1;
					System.out.println(word);
					if(j==0)
					word="";
				} 
			word="";
		}
		
		for(x=1;x<=array[0].length-1;x++)
        {
		   j=x;
		   i=array.length-1;
			   while(j<=array[0].length-1)
			   {
				word=word+array[i][j];
					if(search.equals(word))
					{
					  count++;	
					}
				i=i-1;
				j=j+1; 
				System.out.println(word);
				if(i==0)
				word="";
			   }  
			word="";
		} 
		
		 for(x=0;x<=array[0].length-1;x++)
		{
			i=0;
			j=x;
				while(j>=0 &&i<=array.length-1)
				{
				word=word+array[i][j];
					if(search.equals(word))
					{
					  count++;	
					}
					i=i+1;
					j=j-1;
					System.out.println(word);
					if(i==0)
					word="";	
				} 
		word="";
		}		
				
		for(x=1;x<array.length;x++)
		{
		   j=array[0].length-1;
		   i=x;
		   while(i<=array.length-1)
		   {
			   word=word+array[i][j];
				if(search.equals(word))
				{
				  count++;	
				}
					i=i+1;
					j=j-1;
				System.out.println(word);
				if(j==0)
				word="";
		   } 
		   word="";
		} 
		
		for(x=array[0].length-1;x>=0;x--)
		{
		   j=x;
		   i=0;
		   while(j<=array[0].length-1)
		   {
			   word=word+array[i][j];
				if(search.equals(word))
				{
				  count++;	
				}
					i=i+1;
					j=j+1; 
			System.out.println(word);
				if(i==0)
				word="";
		   }
			word="";
		}
		
		for(x=1;x<=array.length-1;x++)
		{
		   i=x;
		   j=0;
		   while(i<=array.length-1)
		   {
			   word=word+array[i][j];
				if(search.equals(word))
				{
				  count++;	
				}
					i=i+1;
					j=j+1;
				System.out.println(word);
					if(j==0)
					word="";
		   } 
		   word="";
		}
		
		for(x=0;x<=array.length-1;x++)
		{
		   i=x;
		   j=array[0].length-1;
		   while(i>=0)
		   {
			   word=word+array[i][j];
				if(search.equals(word))
				{
				  count++;	
				}			   
					i=i-1;
					j=j-1; 
			System.out.println(word);
					if(j==0)
					word="";
		   } 
		word="";
		}
		
		for(x=array[0].length-2;x>=0;x--)
		{
		   j=x;
		   i=array[0].length-1;
		   while(j>=0)
		   {
			   word=word+array[i][j];
				if(search.equals(word))
				{
				  count++;	
				}
					i=i-1;
					j=j-1; 
			System.out.println(word);
					if(i==0)
					word="";
		   } 
		word="";
		}
		
		if(count>0)
		System.out.println("The word your entered occurred in " +count+ " times");
		else
		System.out.println("The word your entered not occurred in top to bottom,left to right,diagonally & anti diagonally");
	}
}