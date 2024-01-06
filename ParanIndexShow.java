import java.util.*;
class ParanIndexShow
{
	public static void main(String args[])
	{
		Stack<Character> stack = new Stack<Character>();
	    String exp="(20+[{()}])";
		int size=exp.length();
		boolean flag=true;
		char curr,prev;
		for(int i=0;i<size;i++)
		{
			curr=exp.charAt(i);
			if(curr=='(' || curr=='['|| curr=='{')
			{
				stack.push(curr);
			}
			else if(curr==')' ||curr==']'||curr=='}')
			{
				if(stack.isEmpty())
				{
				System.out.println("Not balanced");
				flag=false;
				break;
				}				
				else 
				{	
					prev=stack.peek();
					if((prev=='('&& curr==')')||(prev=='{' &&curr=='}') ||(prev=='[' && curr==']'))
					{
						stack.pop();
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
		if(stack.isEmpty() && flag==true)
		{
			
			System.out.println(" Balanced");
		}
		else if(flag==true)
		{
			System.out.println("Not Balancedd");
		}
    }
}