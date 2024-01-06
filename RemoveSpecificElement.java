import java.util.Scanner;
class RemoveSpecificElement
{
    public static void main (String args[])
    {
        System.out.println("Enter the array size: ");
        Scanner sc=new Scanner(System.in);       
		int arraysize=sc.nextInt();
        int array[]=new int[arraysize];
        int i;
            for(i=0;i<arraysize;i++)
            {       
              array[i]=sc.nextInt();
            }
        System.out.println("Enter the element to remove : "); 
        int removeno=sc.nextInt();
            for(int j=0;j<arraysize;j++)
            {
                if(array[j]==removeno)
                 {
                   array[j]=0;    
                 }      
            }
            for(int k=0;k<arraysize;k++)
            {
                if(array[k]==removeno)  
                {
                   array[k]=array[k+1];
                }
              System.out.print(array[k]+" ");
                 
            }
    }
 }
