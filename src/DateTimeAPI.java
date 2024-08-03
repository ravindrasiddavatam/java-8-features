import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatter = localDate.format(myFormatter);
		System.out.println(formatter);
		
		LocalTime now1 = LocalTime.now();
		System.out.println(now1);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
		ZonedDateTime now4 = ZonedDateTime.now();
		System.out.println(now4);
		
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		Instant now5= Instant.now();
		System.out.println(now5);
		
		
		
		
	}

}
