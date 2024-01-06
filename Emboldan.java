class Emboldan
{
	public static void main(String args[])
	{
		String s1="abcdefgh";
		String list[]={"bcd","def"}; //test case's :"bcd","def","fgh"//"bcd" "efg" //"bc" "de" fg""//"bcd" "f"//"bcde" "fg"
		String boldopen="<b>";
		String boldclose="</b>";
		int count=0,index=0,j=0,forj=0;
		int startindex, endindex;
		String sum ="",temp="";
		boolean flag =false;
		//iterating over the list array to check pattern first letter matching with given string
			for(int i=0;i<list.length;i++)
			{
				char pattern = list[i].charAt(0);
				
				//iterating over the given string to check pattern first letter matching with any character in the given string
				for( j=0;j<s1.length();j++)
				{
					char letter = s1.charAt(j);
					
					if(pattern!=letter&& forj==j)//the pattern ,letter not equal than concat the both letters
					{
						sum=sum+letter;
						
					}
					else if(pattern==letter)//both are equal then check the next index are same
					{  
					if(list[i].length()==1)//if the pattern have one length then simply concat the char
					{
						sum=sum+boldopen+pattern+boldclose;
					}
				
						endindex=j+1;
						int len =j+list[i].length();
						
						for(int k=1;k<list[i].length();k++)//check the next series of pattern in list
						{
							char pat=list[i].charAt(k);
							
							for(int l=endindex;l<endindex+1;l++)//check the next index of string
							{	
								char let=s1.charAt(l);
								
								if(pat==let)//equals then increase the count
								{
									count++;
								}
								
								if(pat!=let)
								{
									sum+=let;
								}
								else if(count==list[i].length()-1) //count & pattern length are same then put the bold open &close tags.
								{
									sum=sum+boldopen+list[i]+boldclose;
									count=0;//reset the count for next iteration
									break;
								}
							}
							endindex++;
						}
						index=list[i].length()+j; //don't repeat starting index for next iteration
						break ;
					} 	
				}
				forj=j+list[i].length();
				if(i==list.length-1)
				{
					sum=sum+s1.substring(index,s1.length());//after the pattern concat the remaining string  
				}
				//here we get the answer for embolden
			}	
				//overlap the repeated character 
				int secindex,countt=0;
				String newsum;
				for(int x=0;x<list.length-1;x++) //check the pattern list index endchar & next patternlist index startchar same
				{
					int v =(list[x].length())-1;
					char one =list[x].charAt(v);
					char two =list[x+1].charAt(0);
					if(one==two)//equals
					{	
						flag=true;
						for(int a=0;a<sum.length();a++)//taking the final result of embold string as sum
						{	char first =sum.charAt(a);
							for(int b=a+1;b<sum.length()-1;b++)
							{	char sec =sum.charAt(b);
								if(first==sec && first==one)//checking two character are equals
								{
									countt++;
									secindex=b;
								}
								if(countt==1)
								{
									newsum =sum.substring(0,a)+sum.substring(b);//removing bold on overlapped characters
									sum=newsum;//construct new sum for next iteration
									countt=0;
								}
							}
						}
					}
					
				}
				if (flag)
					System.out.println("Overlapping pattern with em bold : "+sum);
				else if (!flag)
					System.out.println("Pattern after em bold : "+sum);
		}
	}