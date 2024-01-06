public class Copycontent 
{
    public static void main (String args[])
    {
        int i=0;
        int a[]=new int[] {8,9,5,3,9,6};
        int b[]=new int[a.length];
         b[i]=a[i];
     System.out.println("A elements");
        for(i=0;i<a.length;i++)
        {
    System.out.println(""+a[i]);
        }
   System.out.println("B elements"); 
        for(i=0;i<b.length;i++)
        {
            System.out.println(""+b[i]);
    }}}
