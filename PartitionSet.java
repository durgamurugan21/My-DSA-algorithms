class PartitionSet
{
	public static void main(String args[])
	{
		//5,3,8,4,9,13,7,12//15, 5, 20, 10, 35, 25//3,1,1,2,2,5
		int array[]={15, 5, 20, 10, 35};
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
		else if (total%2==0 )
		{
			int sum=total/2;
			boolean flag=false; 
			System.out.println(sum);
			total=0;
			for(int i=0;i<array.length;i++)
			{
				if(sum==array[i])
				{
					flag=true;
					break;
				}
				for(int j=i+1;j<l;j++)
				 {
					if(sum==array[j])
					{
						flag=true;
						break;
					}
					total+= array[i]+array[j];
					if(sum==total)
					{
						flag=true;
						break;
					}
					if(sum==array[i]+array[j])
					{
						flag=true;
						break;
					}
					if(j>2)
					{
						if(sum==array[i]+array[j-1]+array[j])
						{flag=true;
						break;}
						if(sum==array[i]+array[j-2]+array[j])
						{flag=true; 
						break;}	
					}
						
				}
				total=0;
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
}