package DateTimeAPI;

import java.time.LocalDate;

public class DateDemo1 {
public static void main(String[] args) {
	LocalDate ld=LocalDate.now();
	System.out.println(ld);
	
	LocalDate date=ld.plusDays(3);
	System.out.println(date);
	
	LocalDate date1=ld.plusMonths(5);
	System.out.println(date1);
	
	boolean leapyear=LocalDate.parse("2020-12-22").isLeapYear();
	System.out.println(leapyear);
	
	boolean before=LocalDate.parse("2022-10-23").isBefore (LocalDate.parse("2021-10-23"));
	System.out.println(before);
}
}
