package chapter4;

import java.util.Scanner;

public class CheckISBN10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhập 9 chữ số đầu tiên của ISBN dưới dang số nguyên: ");
		String number = input.next();
		int isbn = 0;
		
		for (int i = 1; i < 9; i++) {
			isbn += Integer.parseInt(number.charAt(i) + "") * (i + 1); 
		}
		isbn %= 11;
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(number.charAt(i));
		}
		
		if (isbn == 10) {
			System.out.println("X");
		} else {
			System.out.println("Số ISBN-10 là: " + isbn);			
		}
		input.close();
	}

}
//parseInt chuyển đổi chuỗi thành số nguyên, 
//charAt chuyển đổi lấy ký tự tại một chỉ số cụ thể trong một chuỗi.