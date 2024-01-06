import java.util.*;	

class ParenthesesValidation
{
	public static void main (String args[])
	{
	String exp="(1(2+34(5)6))";
	int length=exp.length();
	int popencount=0,pclosecount=0;
	int[] openparenindex=new int[exp.length()];
	int[] closeparenindex=new int[exp.length()];
	int indopen=1;
	int indclose=1;
	Scanner sc=new Scanner(System.in);
		for(int i=0;i<length;i++)
		{
			char brac=exp.charAt(i);
			if(brac=='(')
			{
				openparenindex[indopen]=i; 
				indopen++;
				popencount++;
			}
		}
       for(int i=length-1;i>=0;i--)
		{   char brac=exp.charAt(i);	
			if(brac==')')
			{
				closeparenindex[indclose]=i;
				indclose++;
				pclosecount++;
			}
		}
		int index;
		if(popencount==pclosecount)
		{
			System.out.println("The exp is Balanced");
			System.out.println("Which pair of index You want print to print : ");
			index=sc.nextInt();
			System.out.println(openparenindex[index]+"( position of the first parenthesis, " 
			+closeparenindex[index]+" )position of the last parenthesis");
		}
		else
		{
		System.out.println("The Given Exp is unbalanced");	
		}	
	}
}