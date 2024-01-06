import java.util.*;class Stringprint{ public static void main(String args[])  { 	String input;	System.out.println("Enter the input string");	Scanner sc=new Scanner(System.in);	input=sc.nextLine();
	int printtime=0,j;	for(int i=0;i<input.length();i++)	{		char check=input.charAt(i);		 if( (check>=65) && (check <=90) || (check>=96) && (check<=122))
		 {
			 for( j=i+1;j<input.length();j++)
			 {
				 char intno=input.charAt(j);				 				  System.out.println("intno="+intno+"check="+check);						
				if(intno>48&&intno<=99)				{	printtime=printtime+intno;}
				else 
				{
					break;
				}
			 }			 
					if(printtime<=99)
					{	for(int k=0;k<printtime;k++)
						{ 						 System.out.println("word"+check);						}
					}
					else                    {
						System.out.println("number of print time should be the range of 0-99");
					}
		 }    }  }}