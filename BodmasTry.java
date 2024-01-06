import java.util.*;
import java.lang.*;
class BodmasTry
{
	public static void main(String args[])
	{
		String exp="20+[8*2+(6*3-14/2)]";
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
		inputexp=obj.paran(newexp,endexp);
		exptemp=exp.substring(0,endindex)+inputexp;
		newexp=new String(exptemp);
		endexp=newexp.length()-1;
		inputexp=obj.paran(newexp,endexp);
		//newexp=new String(exptemp);
	}
		//First part of given string which contains pairs of parentheses
		String paran (String newexp,int endexp)
		{
		char op;
		char operator[]={'/','*','+','-'};
		int j=0,sind=0,eind=0,cal=0;
		String firstvalue,secondvalue;
		int one,two;
		String calval="",temp="";
		for(int i=0;i<newexp.length();i++)
		{
			op=newexp.charAt(i);
			if(op==operator[j])
			{
				System.out.println("iteration"+op);
				sind=i-1;
				System.out.println(sind);
				eind=i+1;
				System.out.println(eind);
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
						System.out.println(one);
						System.out.println(two);
						cal=one*two;
						System.out.println(cal);
						calval=Integer.toString(cal);
						System.out.println(calval);
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
					j++;
					//After the calculation construct the new exp 
					temp=newexp.substring(0,i-firstvalue.length())+calval+newexp.substring(i+secondvalue.length()+1,endexp+1);
					newexp=new String(temp);
					System.out.println(newexp);
					i=0;
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
				char check=newexp.charAt(i);
				if(Character.isDigit(check))
				{
					firstvalue=newexp.charAt(i)+firstvalue;
					
				}
				else if(check=='+'||check=='-'||check=='*'||check=='/'|| check=='('||check==')')
				{
				break;
			    }
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
}

/*
String temp="";
					char value,valueone;
					for(int k=0;k<newexp.length();k++)
					{
						value=newexp.charAt(k);
						
						for(int l=0;l<remove.length();l++)
						{
						valueone=remove.charAt(l);
							
						}
						if(value==valueone)
							
						   continue;
					    else 
						temp=temp+newexp.charAt(k);
					*/