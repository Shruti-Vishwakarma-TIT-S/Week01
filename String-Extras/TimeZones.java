import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
// Create class TimeZones
public class TimeZones { 
    public static void main(String[] args) { 
        // Get the current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT")); 
        // Get the current time in IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); 
        // Get the current time in PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); 
        // Display the times in different time zones
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Current time in GMT: " + gmtTime.format(formatter)); 
        System.out.println("Current time in IST: " + istTime.format(formatter)); 
        System.out.println("Current time in PST: " + pstTime.format(formatter)); 
    }
}
