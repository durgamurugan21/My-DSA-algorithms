public class Combin			 
    {  static int count=0;
        public static void main(String[] args)  
      {  
			
            String str = "ABCD";  
            int len = str.length();  
            System.out.println("All the permutations of the string are: ");  
            generatePermutation(str, 0, len); 
            System.out.println(count);			
        }                                                                                                                                                                                             
        public static String swapString(String a, int i, int j)
        {  
            char[] b =a.toCharArray();  
            char ch;  
            ch = b[i]; 
            b[i] = b[j];  
            b[j] = ch;   
			count++;
            return String.valueOf(b);    
        }  
        public static void generatePermutation(String str, int start, int end)  
        {  
           
            if (start == end-1)  
                System.out.println(str);  
            else  
            {  
                for (int i = start; i < end; i++)  
                {  
                    System.out.println("str "+str+ " start "+start+" i "+i); 
                    str = swapString(str,start,i);
                    generatePermutation(str,start+1,end);  
                    //System.out.println("str1 "+str+ " start "+start+" i "+i); 
                    
                    //str = swapString(str,start,i);  
                }  
            }  
        }  
    }  
