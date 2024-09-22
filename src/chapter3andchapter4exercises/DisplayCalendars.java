package chapter3andchapter4exercises;

import java.util.Scanner;

public class DisplayCalendars {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	System.out.print("Nhập năm cần in lịch: ");
	int year = input.nextInt();
	
	System.out.print("Nhập ngày đầu tiên của năm: ");
	int firstDayOfYears = input.nextInt(); //0 = chủ nhât, 1 = Thu2, 2 = Thu3,...
	
	String monthOfYears = "";
	int dayOfWeek = firstDayOfYears;
	
	
	int numberDay = 0;

	System.out.println(" \t \t  *~* LỊCH NĂM " + year + " *~* ");
	for(int month = 1; month <= 12; month++) {
		
		switch(month) {
			case 1: monthOfYears = "January"; break;
			case 2: monthOfYears = "February"; break;
			case 3: monthOfYears = "March"; break;
			case 4: monthOfYears = "April"; break;
			case 5: monthOfYears = "May"; break;
			case 6: monthOfYears = "June"; break;
			case 7: monthOfYears = "July"; break;
			case 8: monthOfYears = "August"; break;
			case 9: monthOfYears = "September"; break;
			case 10: monthOfYears = "October"; break;
			case 11: monthOfYears = "November"; break;
			case 12: monthOfYears = "December"; break;
		}
		System.out.println("\n \t\t " + monthOfYears + " " + year);
		System.out.println(" ---------------------------------------------------");
		
		String dayName = "";
		System.out.println(dayName);
		switch(dayOfWeek) {
			case 0: dayName = "Sun"; break; 
			case 1: dayName = "Mon"; break;
			case 2: dayName = "Tue"; break;
			case 3: dayName = "Wed"; break;
			case 4: dayName = "Thu"; break;
			case 5: dayName = "fri"; break;
			case 6: dayName = "Sat"; break;
		}
		System.out.print(" Sun \t Mon \t Tue \t Wed \t Thu \t Fri \t Sat \n");
		
		switch(month) {
		case 2: 
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				numberDay = 29;
			} else {
				numberDay = 28;
			}
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			numberDay = 31;
			break;
		case 4: case 6: case 9: case 11: 
			numberDay = 30;
			break;
		}
		
		for (int i = 1; i <= dayOfWeek; i++) {
			System.out.print("\t");
		}
		for(int i = 1;i  <= numberDay; i++) {
			System.out.print(" " + i + "\t");
			if(dayOfWeek == 6) {
				System.out.println();
			}
			dayOfWeek=++dayOfWeek > 6 ? 0 : dayOfWeek;
			
		}
	}
	
	input.close();
	}

}
