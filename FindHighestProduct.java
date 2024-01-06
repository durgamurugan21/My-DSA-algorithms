 import java.util.*;
class FindHighestProduct
{	
	public static void main(String args[])
	{
		String number="12349-8-5";
	
		 int array[]=new int[number.length()];
		
		for(int i=0;i<number.length()-1;i++)
		{
			
			if(number.charAt(i)=='-')
			{
				char word='1';
				word=number.charAt(i+1);
				//Integer intg = new Integer(number.charAt(i)+number.charAt(i+1));
				int val=Character.getNumericValue(word);
				int min=-(val);
				array[i]=min;
				System.out.println(array[i]);
			i++;
			}
			else
			{
			int value=number.charAt(i)-'0';
			array[i]= value;                    //Arrays.toString(value); /*ASCII value for 0 or put 48 bc u know the reason */		
			}
			System.out.println(array[i]);		
		}
		//System.out.println(Arrays.toString(array));
		int size=array.length;
		int product=0;
		int triples[]=new int[3];
		for(int i=0;i<size-2;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					if(array[i]*array[j]*array[k]>product)
					{
						product=array[i]*array[j]*array[k];
						triples[0]=array[i];
						triples[1]=array[j];
						triples[2]=array[k];
						
					}
				}	
		    }		
		}
		System.out.println("The highest product is " +product);
		for(int numbers:triples)
			System.out.print(numbers+" ");
			
	}
}