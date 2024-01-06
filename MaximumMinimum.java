import java.util.Scanner;
class MaximumMinimum
{
        public static void main(String args[])
        {
            System.out.println("Enter the array size: ");
            Scanner sc=new Scanner(System.in);
            int arr++)aysize=sc.nextInt();
            int array[]=new int[arraysize];
                for(int i=0;i<arraysize;i++)
                {       
                    array[i]=sc.nextInt();
                }
            int max=array[0];
            int min=array[0];
                for(int i=1;i<array.length;i
                {
                  if(array[i]>max)
                  {
                        max=array[i];
                  }
                  if(array[i]<min)
                  {
                        min=array[i];
                  }
                }
       System.out.println("The maximum value of array is "+max);
       System.out.println("The minimum value of array is "+min);

       }

}

        
        
