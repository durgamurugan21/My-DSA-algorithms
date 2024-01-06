import java.util.Scanner;
class ReverseAnArray
{
	public static void main (String args[])
	{
        System.out.println("Enter the array size: ");
        Scanner sc=new Scanner(System.in);
        int arraysize=sc.nextInt();
        int array[]=new int[arraysize];              
            for(int i=0;i<arraysize;i++)
            {       
                array[i]=sc.nextInt();
            }
        System.out.println("Given Array");
            for(int i=0;i<arraysize;i++)
            {       
                System.out.println(array[i]);
            }
        System.out.println("Reverse Array");
            for(int i=arraysize-1;i>=0;i--)
            {       
                 System.out.println(array[i]);
            }

    }
}
