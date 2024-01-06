import java.util.*;
class ParanIndexShowArray
{
	public static void main(String args[])
	{
	String exp="(20+33{67,9{}}[])";
	
		char array[]=new char[exp.length()];
		int size=exp.length();
		char curr,prev;
		int index,ind=0;
		
		int[] openparenindex=new int[exp.length()];
	    int[] closeparenindex=new int[exp.length()];
	    int indopen=1;
	    int indclose=1;
		
		boolean flag=true;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<size;i++)
		{
			curr=exp.charAt(i);
		  if(curr=='(' || curr=='['|| curr=='{')
			{
			array[ind]=curr;
			ind++;
			openparenindex[indopen]=i; 
			indopen++;
			}
		  else if(curr==')' ||curr==']'||curr=='}')
			{
				if(array[0]=='\0' || array[ind-1]=='\0')
				{
					System.out.println("Not balanced");
					flag=false;
					break;	
				}
				else
				{  
			      prev=array[ind-1];
				  if((prev=='('&& curr==')')||(prev=='{' &&curr=='}') ||(prev=='[' && curr==']'))
					{  
				        array[ind-1]='\0';
						ind=ind-1;
					}
				 else
					{
					System.out.println("Not baalanced");
				    flag=false;
				    break;
					}
		        }	
			}	
	    }
		for(int i=size-1;i>=0;i--)
		{   char brac=exp.charAt(i);	
			if(brac==')' ||brac==']'||brac=='}')
			{
				closeparenindex[indclose]=i;
				indclose++;
			}
		}
		if((array[0]=='\0')&& (flag==true))
		{
			System.out.println("Balanced");
			System.out.println("Which pair of index You want print to print : ");
			index=sc.nextInt();
			System.out.println(openparenindex[index]+"( position of the first parenthesis, " 
			+closeparenindex[index]+" )position of the last parenthesis");
		}
		else if(flag==true)
		{		
			System.out.println("not Balanced");
		}
	}
}
