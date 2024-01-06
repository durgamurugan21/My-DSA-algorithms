import java.util.Arrays;
class ConsecutiveElementc
{
    public static void main(String args[])
    {
        int array[]=new int[]{1,2,3,4,5,98,99,200};
        int count=0;
        int max=0,index=0,l=array.length;
        Arrays.sort(array);
            for(int i=0;i<array.length-1;i++)
            { 
                if(array[i]+1==array[i+1] )
                {
                  count++; 		  
                }
                else
                {   
				   if(max<=count)
				  {
					index=i;
					System.out.println(i);
					System.out.println(count);
					max=count; 
					count=0;
				  }                             
                }                     
            } 
		System.out.println(" Consecutive Elements");
               
                for(int i=index-max;i<=index;i++)
                {                                                   
                        System.out.print(" " +array[i]+"");
                }                                          
        }

}


