public class Combination
 {
    public static void main(String arg[])
        {
        int count=0;
        String[] str = {"red","blue","green"}; 
        for(int i = 0 ; i < str.length ; i++)
        {
            for(int j = 0 ; j < str.length; j++)
            {
                for(int k=0;k<str.length;k++)
                              
                {
                    if((i!=j)&&(j!=k)&&(k!=i))
                    {
                       System.out.print(" " +str[i]+" " +str[j]+" " +str[k]);
                       count++; 
                   } 
                }
                             
                System.out.println(); 
            } 
        } 
            System.out.println("Count "+count); 
    }
    
}
