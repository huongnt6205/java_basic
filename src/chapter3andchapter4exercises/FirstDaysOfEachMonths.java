package chapter3andchapter4exercises;

import java.util.Scanner;

public class FirstDaysOfEachMonths {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập năm bất kì: ");
		int year = input.nextInt();
		
		System.out.print("Nhập ngày đầu tiên của năm: ");
		// 0 = chủ nhật, 1 = Thứ 2,.... 
		int firstDayOfYears = input.nextInt();
		
		int dayOfWeek = firstDayOfYears;
		
		for(int month = 1; month <= 12; month++) {
			String monthName = "";
			
			switch (month) {
				case 1: monthName = "Tháng Một"; break;
				case 2: monthName = "Tháng Hai"; break;
				case 3: monthName = "Tháng Ba"; break;
				case 4: monthName = "Tháng Tư"; break;
				case 5: monthName = "Tháng Năm"; break;
				case 6: monthName = "Tháng Sáu"; break;
				case 7: monthName = "Tháng Bảy"; break;
				case 8: monthName = "Tháng Tám"; break;
				case 9: monthName = "Tháng Chín"; break;
				case 10: monthName = "Tháng Mười"; break;
				case 11: monthName = "Tháng Mười Một"; break;
				case 12: monthName = "Tháng Mười Hai"; break;
			}
			
			String dayName = "";
			switch(dayOfWeek) {
				case 0: dayName = "Chủ nhật"; break;
				case 1: dayName = "Thứ Hai"; break;
				case 2: dayName = "Thứ Ba"; break;
				case 3: dayName = "Thứ Tư"; break;
				case 4: dayName = "Thứ Năm"; break;
				case 5: dayName = "Thứ Sáu"; break;
				case 6: dayName = "Thứ Bảy"; break;
			}
			
			System.out.println("Ngày 1 " +monthName + " Năm " + year + " là " + dayName);
	
		
		 switch (month) {
		 case 2:
			 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				 dayOfWeek = (dayOfWeek + 29) % 7;
			 } else {
				 dayOfWeek = (dayOfWeek + 28) % 7;
			 }
			 break;
         case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
             dayOfWeek = (dayOfWeek + 31) % 7;
             break;
         case 4: case 6: case 9: case 11:
             dayOfWeek = (dayOfWeek + 30) % 7;
             break;
     }
//		if((yearsRandom % 4 == 0 && yearsRandom % 100 != 0) || (yearsRandom % 400 == 0)) {
//			System.out.println("Năm " + yearsRandom + " là năm nhuận vậy có 366 ngày!");
//			
//		} else {
//			System.out.println("Năm " + yearsRandom + " không phải là năm nhuận vậy có 365 ngày");
//		}
		}
		input.close();
	}

}
