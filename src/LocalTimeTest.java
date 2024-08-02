import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class LocalTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalTime now1 = LocalTime.now();
		System.out.println(now1);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		
		ZonedDateTime now4 = ZonedDateTime.now();
		System.out.println(now4);
		
		
		
	}

}
