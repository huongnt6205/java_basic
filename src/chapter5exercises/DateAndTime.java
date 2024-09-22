package chapter5exercises;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static String currentDate() {

		long currentTimeMilis = System.currentTimeMillis();

		Date date = new Date(currentTimeMilis);

		SimpleDateFormat dateFomat = new SimpleDateFormat("dd/MM/yyyy");
		
		return dateFomat.format(date);
	}

//	public static String currentTime() {
//
//		long totalMilliSecond = System.currentTimeMillis();
//
//		long totalSecond = totalMilliSecond / 1000;
//		long currentSecond = totalSecond % 60;
//		long totalMinutes = totalSecond / 60;
//		long currentMinute = totalMinutes % 60;
//		long totalHours = totalMinutes / 60;
//		long currentHours = totalHours % 24;
//		
//		return currentHours + ":" + currentMinute + ":" + currentSecond;
//	}
	  public static String currentTime() {
		  
	        Date date = new Date();
	        
	        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	        return timeFormat.format(date);
	    }
	  
	public static void main(String[] args) {

		System.out.print("Hôm nay là: " + currentDate() + " " + currentTime());
	}

}
