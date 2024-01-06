import java.util.Scanner;
class Countdigit
{
public static void main (String args[])
{
System.out.println("input number");
Scanner sc=new Scanner(System.in);
 int number =sc.nextInt();
 long tenbillion=1000000000;
int count=0;
if(number<0)
{
System.out.println("Plz enter postive number");
}
while(number >0 && number < tenbillion)
{
number=number/10;
count++;
}
System.out.println(count);

}
}



