package chapter5exercises;

public class ConvertMiliSeconds {
	
	public static String convertMillis(long millis) {
		long second = millis / 1000;
		long hour = second / 3600;
		long minutes = (second % 3600) / 60;
		long remainingSeconds = second % 60;
		
		return hour + ":" + minutes + ":" + remainingSeconds;
	}
	
	public static void main(String[] args) {
		
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));
		System.out.println(convertMillis(1000000));
	}
}
