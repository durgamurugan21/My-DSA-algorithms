import java.util.Scanner;
class CommonElementString
{
	public static void main(String args[])
	{
		String arrayone[]=new String[]{"a","b","c","d","e"};
		String arraytwo[]=new String[]{"y","d","a","x","e"};
		boolean flag=false;
        for(int i=0;i<arrayone.length;i++)
        {
            for(int j=0;j<arraytwo.length;j++)
            {
               if(arrayone[i]==arraytwo[j])
                {
                flag=true;
                    if(flag==true)
                    {
                        System.out.println("Common element is "+arrayone[i]);
                        
                    }
                }
            }
        }
       if(flag==false)
		{
			System.out.println("There is no common values are present"); 
        }
    }     
}
