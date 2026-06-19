package assignment5.DatatypeConstructorMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 7. Using two classes and parameterized method print current date and time.

public class C7 {

	public void currentTimeDate(String msg) {
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		
		String formattedDateTime = now.format(format);
		
		System.out.println(msg);
		System.out.println("Current date and time : "+formattedDateTime);
	}
	
}
