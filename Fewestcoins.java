import java.util.Arrays;
class Fewestcoins
{
	public static void main(String args[]) 
	{
	int array[]={5,1,10};
	int temptotatl=15,mul=0,ansmul=0,count=0;
	int totlalamt=15,rem=0,temp=0;
	int temparr[]=new int[array.length];
	boolean flg=false;
	//for sorting the given array
	 for(int i=0;i<array.length;i++)
	 {
		 for(int j=i+1;i<array.length-1;i++)
		 {
			 if (array[i]>array[j])
			 {
				 temp=array[i];
				 array[i]=array[j];
				 array[j]=temp;
			 } 
		 }
	 }
	//iterating  over the array in decreasing order to fetch the highest coin to  reduce maximum amount coin taken
		for(int x=array.length-1;x>=0;x--)
		{
			
	//taking coin 1 times up_to total amt of times to get needed coins by multiplying with given array
			for(int y=1;y<=temptotatl;y++)
			{
				mul=y*array[x];
				 if(mul<=temptotatl)
				{
					temparr[count]=y; //storing times taken to reach the totlalamt in array
					rem=mul;
				}
				else if(mul>temptotatl)
				{
					int q=mul-temptotatl;
					break;
				} 
			}
			ansmul=ansmul+rem;
			
			 if(totlalamt==ansmul)//if we reach the totlal amt then no need iterate the loop
					{
						flg=true;
						break;
					}
			count++;
			temptotatl=temptotatl-rem;
		}
		
      if(flg==true)   
		{   int sum= 0;
			// finally add how many coins need to make the given total 
			for (int z = 0; z <temparr.length; z++) 
			sum += temparr[z]; 
			System.out.println(sum+" coins needs to make the totlalcoin "+totlalamt); 
		}
		//if the given coins are not sufficient to make the totlalamt 
	else{
			System.out.println("NULL");
		}
	}
	
}