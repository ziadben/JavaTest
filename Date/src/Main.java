import java.text.DateFormat;
import java.util.*;
 
public class Main {
	
	public static void main(String...args){
    
	Date d = new Date(1000000000000L);
	System.out.println("1st date : " + d.toString());
	System.out.println(d.getTime());
	System.out.println("-------------------");
	Date d1 = new Date();
    Calendar c = Calendar.getInstance();
//	c.setTime(d1);
	System.out.println(c.getTime());
	System.out.println(c.getFirstDayOfWeek());//===>2 heisst Montag
	if (Calendar.MONDAY == c.getFirstDayOfWeek())
		System.out.println("Monday is the first day of the week");
	System.out.println(" Day of week is " +c.get(Calendar.DAY_OF_WEEK));//Aktueller Tag
	System.out.println(" Day of month is "+ c.get(Calendar.DAY_OF_MONTH));
	System.out.println(" Day of Year is "+ c.get(Calendar.DAY_OF_YEAR));
	 
	Date d2 = new Date(1119280000000L);
	DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
	System.out.println(df.format(d2));

	}

}
