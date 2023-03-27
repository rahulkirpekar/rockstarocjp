package datetimetopic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		LocalDate date = LocalDate.of(2017, 1, 13); 
//		System.out.println("Date : " + date);
//		LocalTime time = LocalTime.of(1, 12, 12);
//		System.out.println("time : " + time);
	
		
		
//		/ Example 1  
//        String dInStr = "2011-09-01";  
//        LocalDate d1 = LocalDate.parse(dInStr);  
//        System.out.println("String to LocalDate : " + d1);  
//        // Example 2  
//        String dInStr2 = "2015-11-20";  
//        LocalDate d2 = LocalDate.parse(dInStr2);  
//        System.out.println("String to LocalDate : " + d2);  
		
		
		
//	    LocalDateTime now = LocalDateTime.now();  
//	    System.out.println("Before Formatting: " + now);  
//	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
//	    String formatDateTime = now.format(format);  
//	    System.out.println("After Formatting: " + formatDateTime);  
	    
	    
	    
	    LocalDateTime datetime1 = LocalDateTime.now();  

	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    
	    String formatDateTime = datetime1.format(format);   
	    
	    System.out.println(formatDateTime);    
	}
}
