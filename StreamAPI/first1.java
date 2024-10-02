package StreamAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class first1 {

    public static void main(String[] args) {
        
        // Get current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        
        // Get current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        
        // Get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        
        // Format date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
        
        // Get date and time for a specific timezone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Date and Time in New York: " + zonedDateTime);
        
        // Add 5 days to the current date
        LocalDate futureDate = currentDate.plusDays(5);
        System.out.println("Date after 5 days: " + futureDate);
        
        // Subtract 2 hours from current time
        LocalTime pastTime = currentTime.minusHours(2);
        System.out.println("Time 2 hours ago: " + pastTime);
    }
}
