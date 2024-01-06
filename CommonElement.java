import java.util.Scanner;
class CommonElement
{
	public static void main(String args[])
	{
		System.out.println("Enter the arrayone size: ");
		Scanner sc=new Scanner(System.in);
		int arraysizeone=sc.nextInt();
		System.out.println("Enter the arraytwo size: ");               
        int arraysizetwo=sc.nextInt();
        int arrayone[]=new int[arraysizeone];
		System.out.println("Enter the First array element: ");                             
        for(int i=0;i<arraysizeone;i++)
        {
          arrayone[i]=sc.nextInt();
        }
        int arraytwo[]=new int[arraysizetwo];
        int count=0;
		System.out.println("Enter the Second array element: "); 
        for(int i=0;i<arraysizetwo;i++)
        {
           arraytwo[i]=sc.nextInt();
        }
                
        for(int i=0;i<arraysizeone;i++)
        {
            for(int j=0;j<arraysizetwo;j++)
            {
                if(arrayone[i]==arraytwo[j])
                {
                  count++;
                     if(count!=0)
                       {
                          System.out.println("Common value is " +arrayone[i]);
                       }
                }
           }
        }
        if(count==0)
        {
            System.out.println("There is no common values are present");
                
        }
                                                
    }
}
