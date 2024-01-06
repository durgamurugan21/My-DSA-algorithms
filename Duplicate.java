import java.util.Arrays;
 
public class Duplicate {
   static void unique_array(int[] my_array)
    {
     
	 int no_unique_elements = my_array.length;
        for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
               
                 
                if(my_array[i] == my_array[j])
                {
                   
                     
                    my_array[j] = my_array[no_unique_elements-1];
                     
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
         
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
         
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+"\t");
        }
         

    }
     
    public static void main(String[] args) 
    {        
        unique_array(new int[] {0, 3, -2, 4, 3, 2});
         
        unique_array(new int[] {10, 22, 10, 20, 11, 22});
         
      }    
}