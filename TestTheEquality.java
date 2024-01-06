class TestTheEquality 
{
	public static void main(String args[])
	{
      int arrayone[]=new int[]{2,5,7,2,7};
      int arraytwo[]=new int[]{2,5,7,2,7};
      int sizeone=arrayone.length;
      int sizetwo=arraytwo.length;
      int count=0;
        if(sizeone==sizetwo)
        {
          for(int i=0;i<arrayone.length;i++)
            {
              if(arrayone[i]==arraytwo[i])
                {
                count++;
                }
            }
        }
		else
        {
           System.out.println("plz enter the equal length of array");

        }
        if(count==arrayone.length-1)
        {
            System.out.println("The given arrays are equal");
        }
        else
        {
           System.out.println("elements are not equal ");

        }
    }
 }
