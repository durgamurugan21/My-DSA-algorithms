import java.util.Scanner;
class IteratingArray
{
    public static void main(String args[])
    {
        System.out.println("Enter the array size: ");
        Scanner sc=new Scanner(System.in);
        int arraysize=sc.nextInt();
        int arrayone[]=new int[arraysize];
           for(int i=0;i<arraysize;i++)
           {       
              arrayone[i]=sc.nextInt();
           }
        int arraytwo[]=new int[arrayone.length];                             
        System.out.println("First Array Elements : ");       
            for(int i=0;i<arraysize;i++)
            {       
                System.out.println(arrayone[i]);
            }
        System.out.println("Second Array Elements : ");               
            for(int i=0;i<arraysize;i++)
            {       
                arraytwo[i]=arrayone[i];      
                System.out.println(arraytwo[i]);
            }
                             
    }
}
