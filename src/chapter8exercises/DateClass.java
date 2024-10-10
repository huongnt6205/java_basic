package chapter8exercises;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println("\nNgày và giờ cho các thời gian đã trôi qua 10000, "
				+ "100000, 1000000, 10000000,\n100000000, 1000000000, 10000000000,"
				+ " and 100000000000, respectively");
		for (long i = 10000; i <= 1e11; i *= 10) {
			date.setTime(i);
			System.out.println("Ngày và Giờ: " + date.toString());
		}
	}
}
