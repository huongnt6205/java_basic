package chapter3andchapter4exercises;

import java.util.Scanner;

public class LearnAdditionGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/**************************/
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		
		System.out.print("Người dùng nhập tổng của 2 số đã cho: " + number1 + " + " + number2 + " = ");
		int answer = input.nextInt();
		
		boolean isCorrect = (number1 + number2 == answer);
		
		System.out.println("Đáp án của bạn " + isCorrect);
		
		/******************************/
		
		System.out.print("Nhập ngày hôm nay (vd: Chủ Nhật: 0; Thứ Hai: 1;...; Thứ Bảy: 6):  ");
		int today = input.nextInt();
		
		System.out.print("Nhập số ngày đã trôi qua kể từ này hôm nay: ");
		int daysAfter = input.nextInt();
		
		 int futureDay = (today + daysAfter) % 7;
		 
		String dayName = "";
		
		switch (futureDay) {
			case 0: dayName = "Chủ Nhật"; break;
	        case 1: dayName = "Thứ Hai"; break;
	        case 2: dayName = "Thứ Ba"; break;
	        case 3: dayName = "Thứ Tư"; break;
	        case 4: dayName = "Thứ Năm"; break;
	        case 5: dayName = "Thứ Sáu"; break;
	        case 6: dayName = "Thứ Bảy"; break;
		}
		
		System.out.println("Ngày tương lai trong tuần là : " + dayName);
		input.close();
	}

}
