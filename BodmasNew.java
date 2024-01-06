import java.util.*;
import java.lang.*;
class Bodmasfnl
{
	public static void main(String args[])
	{
		  String exp="20+[8*2+(6*3-14/2)]";
		  do
		  {
		  int size=exp.length();
		  char paran;
		  String newexp;
		  int startindex=0,endindex=0;
		  String inputexp,exptemp;
		  BodmasTry obj=new BodmasTry();
		  //find the input exp have parentheses
		  for(int i=0;i<size;i++)
		  {
		  	paran=exp.charAt(i);
		  	if(paran=='(')
		  	{
		  		startindex=i;
		  	}
		  	else if(paran==')')
		  	{
		  	   endindex=i+1;		
		  	}
		  }
		  newexp=exp.substring(startindex,endindex);
		  int endexp=newexp.length()-1;
		  System.out.println("expression:" +newexp);
		  inputexp=obj.paran(newexp,endexp);
		  String temp=exp.substring(0,startindex-1)+inputexp+exp.substring(endindex,size-1);
		  exp=new String(temp);
		  }while(!isNumber(exp));
	}
		//First part of given string which contains pairs of parentheses
	    String paran (String newexp,int endexp)
		{
			
			char op;
			char operator[]={'/','*','+','-'};
			int sind=0,eind=0,cal=0,one,two;
			String firstvalue,secondvalue,calval="",temp="";
		    //loop to check all operator
			System.out.println("working");
			for(int j=0;j<operator.length;j++)
			{
			System.out.println("working");
			//check for operator 
			for(int i=0;i<newexp.length();i++)
			{
				System.out.println("working");
				op=newexp.charAt(i);
				if(op==operator[j])
				{
					System.out.println("iteration for "+op);
					sind=i-1;
					//System.out.println(sind);
					eind=i+1;
					firstvalue=findValueone(newexp,sind);
					secondvalue=findValuetwo(newexp,eind);
					//performs operations based on BIDMAS
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
						String remove=newexp.substring(i-firstvalue.length(),secondvalue.length());
						System.out.println(remove);
						temp=newexp.replace(calval,remove); 
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
			
			for(int i=sind;i<newexp.length();i--)
			{
				System.out.println("findValueone loop :"+i);
				char check=newexp.charAt(i);
				if(Character.isDigit(check))
				{
					firstvalue=check+firstvalue;
					
				}
				else if(check=='+'||check=='-'||check=='*'||check=='/'|| check=='('||check==')' )
				{
					return firstvalue;
				
			    }
			   // if(sind==0) break;
		    }
			return firstvalue;
		}
		//calculate the values of after operator
		String findValuetwo( String newexp,int eind)
		{		
		     String secondvalue="";
			for(int i=eind;i<newexp.length();i++)
			{
				char check=newexp.charAt(i);
				if(Character.isDigit(check))
				{
					secondvalue=secondvalue+newexp.charAt(i);
					
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
	//String exp = "12345.15";
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(exp);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric)
           return true;
        else
            return false;
    }

}