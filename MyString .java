Class MyString 
{
	public String name="durga";
	public int length=name.length();
	String concat(String str)
	{
		String concat=name+str;
		return concat;
	}
	char charAt(int index) 
	{
		if(index>name.length())
		{
			System.out.println("given index is not valid");
		}
		for(int i=0;i<name.length;i++)
		{
			if(i==index)
			char val=name.i;
		}
		return val;
	}
	boolean endsWith(String suffix)
	 {
		 return;
	 }
	static String copyValueOf(char[] data)
	{
		
	}
	int indexOf(String str)
	{
		
	}
	boolean startsWith(String prefix)
	{
		
	}
	String substring(int beginIndex)
	{
		
	}
	public static void main (String args[])
	{
		MyString obj=new MyString();
		String value=obj.concat();
		System.out.println(value);
	}
}	