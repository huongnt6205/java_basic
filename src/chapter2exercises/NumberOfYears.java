package chapter2exercises;

import java.util.Scanner;
public class NumberOfYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số phút: ");
		long minutes = input.nextLong();
		
		long minutesInday = 60 * 24;
		long minutesInyear = minutesInday * 365;
		long years = minutes / minutesInyear;
		System.out.println("Với " + minutes + "phút, chúng ta có số năm là: " + years);
		
		long remainingMinutes = minutes % minutesInyear;
		System.out.println("Số phút còn lại là: " + remainingMinutes);
		
		long days = remainingMinutes / minutesInday;
		System.out.println("Số ngày là: " + days + "ngày");
		
		System.out.println("Vậy với " + minutes + "phút, chúng ta có " + years + "năm và " + days + "ngày");
		
		
		
	
		input.close();
	}
}
