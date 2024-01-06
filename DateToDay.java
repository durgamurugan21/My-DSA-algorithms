import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateToDay {
public static void main (String args[]) throws Exception
    {	Date d1,d2,d3;
       while(true)
	   {
	   try{
		String day;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Date :");
	    day=sc.next();
        d1=new SimpleDateFormat("dd/MM/yyyy").parse(day);
		System.out.println(d1);
		break;
		}
	   catch(Exception e)
		{
			System.out.println("invalid format! use dd/MM/yyyy");
		}		
		}
		String day1="05/02/2019";
		String day2="10/06/2019";
		d2=new SimpleDateFormat("dd/MM/yyyy").parse(day1);
		d3=new SimpleDateFormat("dd/MM/yyyy").parse(day2);
		if(d1.after(d2) && d1.before(d3))
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
}  

}

/*
LocalDate date = LocalDate.now();
      System.out.println("Current date: "+date);
      //Getting the current time value
      LocalTime time = LocalTime.now();
      System.out.println("Current time: "+time);
*/
