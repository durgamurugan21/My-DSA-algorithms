import java.util.*;
class Calculator 
{	
	public int a,b;
	public int ans;
	public String msg;
	 Calculator(int a,int b)
	 {
		 this.a=a;
		 this.b=b; 
	 }
	 String add()
	 {
		ans=a+b;
		System.out.println("Addition of " +a+ " & " +b+ " = "+ans);  
		msg=sub();
		return msg;
	 }
	 String sub()
	 {
		ans=a-b;
		System.out.println("Subtraction of " +a+ " & " +b+ " = "+ans);
		msg=mul();
		return msg;
	 }
	 String mul()
	 {
		ans=a*b;
		System.out.println("Multiplication of " +a+ " & " +b+ " = "+ans); 
		msg=dev();
		return msg;	
	 }
	 String dev()
	 {
		ans=a/b; 
		System.out.println("Division of " +a+ " & " +b+ " = " +ans);
		 msg="calculation completed";
		return msg;
		//return null;
	 }
 }
class CalculatorDemo
{
	 public static void main(String args[])
	 {
		Scanner scan=new Scanner(System.in);
		System.out.println("values for a & b");
		Calculator refobj=new Calculator(scan.nextInt(),scan.nextInt());
		System.out.println(refobj.add());
	 } 
}
