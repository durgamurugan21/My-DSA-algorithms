class SecondSmallestElement
{
	public static void main(String args[])
	{ 
      int number[]=new int[] {6,3,1,5,9,7,8};
      int  temp,k=0;
         for (int i = 0; i < number.length; i++) 
         {
            for (int j = i + 1; j < number.length; j++)
            { 
                if (number [i] > number[j]) 
                {
                    temp = number [i];
                    number [i] = number [j];
                    number [j] = temp;
                }
            }
         }
     System.out.println("Array Elements in Ascending Order: ");
        for (int i = 0; i < number.length - 1; i++) 
        {
            System.out.print(number [i] + ", ");
        }
        
        //System.out.print(number[number.length-1]);
        System.out.println();
    
     System.out.println("Array Elements in Descending Order: ");
    
        for (int i = number.length - 1; i >=0; i--) 
        {
            System.out.print(number[i] + ", ");
        }
        System.out.println();
     System.out.println("Second smallest value is :"+number[k+1]);       
     System.out.println("Second largest value is :" +number[number.length-2]);       
        
    }
}



       
