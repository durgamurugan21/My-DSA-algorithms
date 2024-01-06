class AntiDia
{
 
       
public static void main(String args[])

 {
                
int array[][]=new int[][]{{1,2,3,4,5},{5,6,7,8,9},{1,2,3,4,10}};
                
int row=3,col=5,i,j;
                
int x;
                
for(x=0;x<=col-1;x++)
                
{
                        
i=0;
                        
j=x;
                
                    
while(j>=0 &&i<=row-1)
                    
{
                    
                           
 System.out.print("[ "+array[i][j]+" ]");
                           
 i=i+1;
                            
j=j-1;
                    
                  
  } 
                    
System.out.println();                 
               
 }
                         
               
for(x=1;x<=row-1;x++)
               
 {
                           
j=col-1;
                           
i=x;
                          
 while(i<=row-1)
                          
 {
                                   
System.out.print("[ "+array[i][j]+" ]");
                                   
 i=i+1;
                                    
j=j-1; 
                          
 } 
                          
 System.out.println(); 
             
   } 
               
       
 }
}



