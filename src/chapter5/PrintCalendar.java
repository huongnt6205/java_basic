package chapter5;

import java.util.Scanner;

public class PrintCalendar {

	public static boolean isLeapYears(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		if (month == 2) {
			return isLeapYears(year) ? 29 : 28;
		}
		return 0;
	}

	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		for (int i = 1800; i < year; i++) {
			if (isLeapYears(i)) {
				total = total + 366;
			} else {
				total = total + 365;
			}
		}

		for (int i = 1; i < month; i++) {
			total = total + getNumberOfDaysInMonth(year, i);
		}

		return total;
	}
	
	public static int getStartDays(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;

		int totalNumberOfDay = getTotalNumberOfDays(year, month);

		return (totalNumberOfDay + START_DAY_FOR_JAN_1_1800) % 7;
	}

	public static void printMonthsBody(int year, int month) {

		int startDay = getStartDays(year, month);

		int numberOfDayInMonth = getNumberOfDaysInMonth(year, month);

		for (int i = 0; i < startDay; i++) {
			System.out.print("     ");
		}
		for (int i = 1; i <= numberOfDayInMonth; i++) {
			System.out.printf("%5d", i);

			if ((i + startDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static String getNameMonth(int month) {
		String nameMonth = "";

		switch (month) {

		case 1:
			nameMonth = "January";
			break;
		case 2:
			nameMonth = "February";
			break;
		case 3:
			nameMonth = "March";
			break;
		case 4:
			nameMonth = "April";
			break;
		case 5:
			nameMonth = "May";
			break;
		case 6:
			nameMonth = "June";
			break;
		case 7:
			nameMonth = "July";
			break;
		case 8:
			nameMonth = "August";
			break;
		case 9:
			nameMonth = "September";
			break;
		case 10:
			nameMonth = "October";
			break;
		case 11:
			nameMonth = "November";
			break;
		case 12:
			nameMonth = "December";
		}
		return nameMonth;
	}

	public static void printMonthTitle(int year, int month) {
		System.out.println("             " + getNameMonth(month) + " " + year);
		System.out.println(" -------------------------------------");
		System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
	}
	
	public static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		
		printMonthsBody(year, month);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập năm: ");
		int year = input.nextInt();

		System.out.print("Nhập tháng dưới dạng số từ 1 đến 12: ");
		int month = input.nextInt();

		printMonth(year, month);
		input.close();
	}
}
