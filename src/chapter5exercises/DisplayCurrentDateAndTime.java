package chapter5exercises;

import java.util.Calendar;

public class DisplayCurrentDateAndTime {

	public static String getCurrentTime() {

		Calendar calendar = Calendar.getInstance();

		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		return hour + ":" + minute + ":" + second;
	}

	public static String getCurrentDate() {

		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		return year + "/" + month + "/" + day;
	}

	public static void displayDateTime(String date, String time) {

		System.out.println("Ngày giờ hiện tại: " + date + " " + time);

	}

	public static void main(String[] args) {

		String currentDate = getCurrentDate();
		String currentTime = getCurrentTime();

		displayDateTime(currentDate, currentTime);

	}

}
