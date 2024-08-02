package chapter2;

public class TuesdayAnd100Days {

	public static void main(String[] args) {
		int daysToAdd = 100;
		String[] daysOfWeek = {"Thứ 2", "Thứ 3","Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7", "Chủ Nhật"};
		 int todayIndex = 1;
		 int futureDayIndex = (todayIndex + daysToAdd) % 7;
		 System.out.println("100 ngày từ Thứ Ba sẽ là: " + daysOfWeek[futureDayIndex]);
	}
	
}
