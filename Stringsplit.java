import java.util.Scanner; 
class Stringsplit
{
	public static void main(String args[])
	{
		System.out.println("Enter the String : ");
		Scanner scan=new Scanner(System.in);
		String  name=scan.nextLine();
		String word="",number="",symbol="";
		
		for(int i=0;i<name.length();i++)
		{
			char letter=name.charAt(i);
			if(letter>='a' && letter<='z'|| letter>='A'&& letter<='Z')
			{
				word=word+letter;
			}
			else if(letter>='0' && letter<='9')
			{
				number=number+letter;
			}
			else
			{
				symbol=symbol+letter;
			}
		}
		name=word+number+symbol;
		System.out.println(name);
		
	}
}