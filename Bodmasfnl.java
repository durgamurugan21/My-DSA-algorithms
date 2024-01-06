import java.util.*;
import java.lang.*;
class Bodmasfnl
{
	public static void main(String args[])
	{
	    String exp="[20+(3/4)-(4*2)]";
		char array[]=new char[exp.length()];
		char curr,prev;
		int ind=array.length-1;
		boolean flag=true;
		int k=array.length-1;
		for(int i=array.length-1;i>=0;i--)
		{
			curr=exp.charAt(i);
		  if(curr==')' || curr==']'|| curr=='}')
			{
			array[ind]=curr;
			ind--;
			}
			else if(curr=='(' ||curr=='['||curr=='{')
			{
				if(array[k]=='\0'|| array[ind+1]=='\0')
				{
					System.out.println("Please Enter the valid Expression");
					flag=false;
					break;	
				}	
				else
				{  
			      prev=array[ind+1];
				  if((prev==')'&& curr=='(')||(prev=='}' &&curr=='{') ||(prev==']' && curr=='['))
					{  
				        array[ind+1]='\0';
						ind=ind+1;
					}
				 else
					{
					System.out.println("Enter the valid Expression");
				    flag=false;
				    break;
					}
		        }	
			}	
	    }
		if((array[k]!='\0')&&(flag==true))
		{		
			System.out.println("Check Expression you were Entered");
		}
		else if(flag==true)
		{
		  System.out.println(exp);
			do
			{
			 array=new char[exp.length()];
		      ind=0;
		      prev='\0';
			  curr='\0';
			  int size=exp.length();
			  String newexp;
			  int startindex=0,endindex=0;
			  String inputexp,exptemp;
			  Bodmasfnl obj=new Bodmasfnl();
			  //find the input exp have parentheses-"[20+(3/4)-(4*2)]";
				for(int i=0;i<size;i++)
				{
				   curr=exp.charAt(i);
					if(curr=='(' || curr=='['|| curr=='{')
					{
						array[ind]=curr;
						startindex=i;
						ind++;
					}
					else if(curr==')' ||curr==']'||curr=='}')
					{
						prev=array[ind-1];
						if((prev=='('&& curr==')')||(prev=='{' && curr=='}') ||(prev=='[' && curr==']'))
						{  
						 endindex=i;
						}
					}
				}
			  newexp=exp.substring(startindex+1,endindex);
			  int endexp=newexp.length()-1;
			  inputexp=obj.paran(newexp,endexp);
			  exptemp=exp.substring(startindex,endindex+1);
			  exptemp=exp.replace(exptemp,inputexp);
			  exp=new String(exptemp);
			  System.out.println(exp);
		    } while(!isNumber(exp));
		 
		}
	}
		//First part of given string which contains pairs of parentheses
	    String paran (String newexp,int endexp)
		{
			System.out.println(newexp);
			char op;
			char operator[]={'/','*','+','-'};
			int sind=0,eind=0,cal=0,one,two;
			String firstvalue,secondvalue,calval="",temp="";
		    //loop to check all operator
			for(int j=0;j<operator.length;j++)
			{
			//check for operator//
			for(int i=0;i<newexp.length();i++)
			{
				op=newexp.charAt(i);
				if(op==operator[j])
				{
					//System.out.println("iteration for "+op);
					sind=i-1;
					eind=i+1;
					firstvalue=findValueone(newexp,sind); //passing arg & value to find firstvalue
					secondvalue=findValuetwo(newexp,eind);//to find sec value
					/*performs operations based on BIDMAS*/
					switch(op)
					{
						case '/':	
							one=Integer.parseInt(firstvalue);
							two=Integer.parseInt(secondvalue);						
							cal=one/two;
							calval=Integer.toString(cal);
							break;
						case '*':
							one=Integer.parseInt(firstvalue);
							two=Integer.parseInt(secondvalue);						
							cal=one*two;
							calval=Integer.toString(cal);
						   break;
						case '+': 
							one=Integer.parseInt(firstvalue);
							two=Integer.parseInt(secondvalue);						
							cal=one+two;
							calval=Integer.toString(cal);
						   break;
						case '-':
						   one=Integer.parseInt(firstvalue);
						   two=Integer.parseInt(secondvalue);
						   cal=one-two;
						   calval=Integer.toString(cal);
						   break;
					} 
						//After the calculation construct the new exp 
						int valone=i-firstvalue.length();
						int valtwo=i+secondvalue.length()+1;	
						String remove=newexp.substring(valone,valtwo);
						temp=newexp.replace(remove,calval); 
						newexp=new String(temp);
						System.out.println(newexp);
					}		
				}
			}
			return newexp;
	    }
	//calculate the values of before operator
       String findValueone( String newexp,int sind)
		{
			String firstvalue=""; 
			for(int i=sind;i>=0;i--)
			{
				char check=newexp.charAt(i);
				if(Character.isDigit(check))
				{
					firstvalue=check+firstvalue;
					
				}
				else if(check=='+'||check=='-'||check=='*'||check=='/'|| check=='('||check==')' )
				{
					//return firstvalue;
				    break;
			    }
			   //if(sind==0) i<=sind break;
		    }
			return firstvalue;
		}
		//calculate the values of after operator
		String findValuetwo( String newexp,int eind)
		{	String secondvalue=""; 
			for(int i=eind;i<newexp.length();i++)
			{
				char check=newexp.charAt(i);
				if(Character.isDigit(check))
				{
					secondvalue=secondvalue+check;	
				}
				else if(check=='+'||check=='-'||check=='*'||check=='/'|| check=='('||check==')')
				{
				break;
			    }
		    }
			return secondvalue;
		}
	static boolean isNumber(String exp)
	{
        boolean numeric = true;
        try {
            int num = Integer.parseInt(exp);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric)
           return true;
        else
            return false;
    }

}