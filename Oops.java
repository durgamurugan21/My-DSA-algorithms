class Oops
{
	public static void main(String args[])
	{
		int a=5;
		int b=5; 
		Oops obj=new Oops();
		Newclass objj=new Newclass();
		obj.add(a,b);
		int add=objj.methodone(a,b);
		System.out.println(add);
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
class Newclass
	{ 
		int methodone(int a, int b)
		{
			int c=a+b;
			return c;
		}
		
	}
	//array of objects
	2.4  15 