package DateTimeAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
public static void main(String[] args) throws Exception{
	Date d=new Date();
	System.out.println(d);
	
	//converting date to string
	SimpleDateFormat sdf1=new SimpleDateFormat("dd/mm/yyyy");
	String format1=sdf1.format(d);
	System.out.println(format1);
	
	//converting string to date
	SimpleDateFormat sdf2=new SimpleDateFormat("mm/dd/yyyy");
	Date parseDate=sdf2.parse("08-24-2024");
	System.out.println(parseDate);
}
}
