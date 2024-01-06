import java.util.Scanner;
class DuplicateStringValues
{
	public static void main(String args[])
	{
		System.out.println("Enter the array size: ");
                Scanner sc=new Scanner(System.in);
                int arraysize=sc.nextInt();
                String array[]=new String [arraysize+arraysize];              
                for(int i=0;i<arraysize;i++)
                {       
                        array[i]=sc.next();
                }
                int count=0;
                for(int i=0;i<arraysize;i++)
                {
                   for(int j=i+1;j<arraysize+1;j++)
                    {
                        if(array[i].equals(array[j]))
                        {
                            count++;
                            if(count!=0)
                                {
									System.out.println("Duplicate value is " +array[i]);
                                }
                        }
                               
                    }
                }
                if(count==0)
                {
                      System.out.println("There is no duplicate values are present");
                
                }
    }
}      
