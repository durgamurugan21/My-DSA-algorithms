import java.util.Scanner;
class InsertNewElement
{
	public static void main (String args[])
	{
		System.out.println("Enter the array size: ");
        Scanner sc=new Scanner(System.in);
                int arraysize=sc.nextInt();
                int array[]=new int[arraysize+arraysize];              
                for(int i=0;i<arraysize;i++)
                {       
                        array[i]=sc.nextInt();
                }               
                System.out.println("Enter the position to insert the new element: ");
                int position=sc.nextInt();
                
                for(int i=0;i<arraysize;i++)
                {
                  if(position==i) 
                  {
                    array[i+1]= i;
                  }  
                 System.out.println(array[i]+ " ");
                }
                System.out.println("Enter the new element: ");
                int newelement=sc.nextInt();
                for(int j=1;j<=arraysize;j++)
                {
                        if(position==j)
                        {
                        array[j]=position;  
                        }  
                }
                System.out.println("After Insertion");
                for(int i=0;i<=arraysize+1;i++)
                {
                 System.out.println(array[i]+ " ");
                
                }
 
 }
}

