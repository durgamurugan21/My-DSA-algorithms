import java.util.Scanner;
class SumOfSpecifiedNumber
{
	public static void main(String args[])
	{
	int array[]=new int[6];
	array[0]=1;
	array[1]=4;
	array[2]=5;
	array[3]=6;
	array[4]=7;
	int count=0;

	System.out.println("Enter the number to check the pair sum");
	Scanner sc=new Scanner(System.in);
	int sum=sc.nextInt();
		  for(int i=0;i<array.length-1;i++)
		   {
				for(int j=i+1;j<array.length-1;i++)
				{
					if(sum==array[i]+array[i+1])
					{
						count++;
						System.out.println(sum+ " is equal to the pair of " +array[i]+"," +array[i+1]);
					} 	
				}    
					
		    }
	 if(count==0)
     {
        System.out.println(sum+ "is not equal to any pair");
     }   
  
    }
 }
