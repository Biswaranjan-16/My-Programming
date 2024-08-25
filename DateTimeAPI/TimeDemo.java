package DateTimeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class TimeDemo {
public static void main(String[] args) {
	LocalTime lt=LocalTime.now();
	System.out.println(lt);
	
	Period between=Period.between(LocalDate.parse("1991-09-23"), LocalDate.now());
	System.out.println(between);
	System.out.println(between.getYears());
	System.out.println(between.getMonths());
	System.out.println(between.getDays());
	
	Duration du=Duration.between(LocalTime.parse("19:30"), LocalTime.now());
	System.out.println(du);
	System.out.println(du.getSeconds());
	
	LocalDate of=LocalDate.of(2022, 01, 10);
	System.out.println(of);
			
}
}
