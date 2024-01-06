import java.util.Scanner;
class gold
{
	public static void main(String args[])
	{
		int rr[]={1,2,3,4,5};
		System.out.println("enter the i value:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("enter the j value:");
		int j=sc.nextInt();
		int vone=0,vtwo=0; 
		boolean fl1=false,fl2=false;
		for(int l=0;l<rr.length;l++)
		{
			if(rr[l]==i)
			{
				vone=l;
				fl1=true;
			}
			else if(rr[l]==j)
			{ vtwo=l;
				fl2=true;
		}
		}
		if(fl1==fl2)
		{
			sum(rr,vone,vtwo);
		}
		else
		{System.out.println("plz enter the subset of given array");}
	}  
	static void sum(int rry[],int v1,int v2)
	{
		int add=0;
		for(int i=v1;i<v2;i++)
		{
			add=add+rry[i];
		}
	System.out.println("sum of subset("+rry[v1]+","+rry[v2]+")is,"+add);
	}


}