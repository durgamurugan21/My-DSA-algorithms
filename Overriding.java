public class Overriding {
     public static void main(String args[])
    {
    	CarClass obj = new Ford();
    	int number= obj.speed();
    	System.out.println("Speed Limit is: "+number);
    }
	}
class CarClass
{
public int speed() 
    {
        return 100; 
    }
}
class Ford extends CarClass
{
    public int speed()
    {
        return 150;
    }
   }
