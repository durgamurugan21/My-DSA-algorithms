class Freedom
{
public static void main(String ags[])
{
	int person[]={1,2,3,4,5};
	int n=person.length;
	int s=3;
	int count=0;
	for(int i=s-1;i<person.length-2;i++)
	{
		if(person[i]!=0) 
		{
			person[i+2]=0;
			count++;
		}
		if(person[i]==0)
		{
			continue;
		}
		if(i+1==person.length-2)
		{
			i=0;
		}
		
		if(count==person.length-1)
		{
			break;
		}
	}
	for(int j=0;j<person.length;j++)
	{
		if(person[j]!=0)
		{
			System.out.println("freedom person"+person[j]);
		}
		
	}
	
}

}