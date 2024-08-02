package chapter2;

public class ShowCurrentTime {

	public static void main(String[] args) {
		long totalMilliSecond = System.currentTimeMillis();
		
		long totalSecond = totalMilliSecond / 1000;
		long currebtSecond = totalSecond % 60;
		long totalMinutes = totalSecond / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("Thoi gian hien tai la: " + currentHour + ":" + currentMinute + ":" + currebtSecond);
		
	}

}
