class Partition
{
	public static void main(String args[])
	{   //5,3,8,19,34,25
		int array[]={15, 5, 20, 10, 35, 25};
		int total=0;
		int l=array.length;
		for(int i=0;i<array.length;i++)
		{
			total=total+array[i];	
		}
		if(total%2!=0)
		{
		System.out.println(false);
		}
		int sum=total/2;
		boolean flag=false; 
		System.out.println(sum);
		int midvalue=array.length/2;
		int totalone=0,totaltwo=0;
		total=0;
		for(int i=midvalue-1;i<=0;i--)
			{
				if(sum==array[i])
					{
						flag=true;
						break;
					}
						totalone+= array[i];
					if(sum==totalone)
					{
						flag=true;
						break;
					}	
					
				for(int j=midvalue;j<array.length;j++)
				{
					if(sum==array[j])
						{
							flag=true;
							break;
						}
							totaltwo+= array[j];
						if(sum==totaltwo)
						{
							flag=true;
							break;
						}
						if(sum==totalone+array[j])
						{
							flag=true;
							break;
						}
				}
				
				if(sum==totaltwo+array[i])
						{
							flag=true;
							break;
						}
				
			}
			
		for(int i=0;i<array.length;i++)
		{ 
		 total= total+array[i];
			 if(sum==total)
			 { flag=true;
			 break;}
		 else if(total>sum)
		   total=total-array[i];
        }

	if (flag==true){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
	}
}