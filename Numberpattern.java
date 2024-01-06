class Numberpattern
{
   public static void main (String args[])
    {
       int row=10,number=1;
          for(int i=0;i<row;i++)
            {
                for(int j=0;j<=i;j++)
                {
					System.out.print( number+ "");
					number++;
                }
              System.out.println();
			}
          
    }
}
/*
1
23
456
78910
1112131415
161718192021
22232425262728
2930313233343536
373839404142434445
46474849505152535455
*/