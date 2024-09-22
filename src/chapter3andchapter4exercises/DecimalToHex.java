package chapter3andchapter4exercises;

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// chuyển thập phân sang thập lục phân
		System.out.print("Nhập một số nguyên dưới dang thập phân: ");
		int decimal = input.nextInt();

		String hexadecimal = "";
		if (decimal == 0) {
			hexadecimal = "0";
		} else {
			while (decimal > 0) {
				int remainder = decimal % 16;
				if (remainder < 10) {
					hexadecimal = remainder + hexadecimal;
				} else {
					switch (remainder) {
					case 10:
						hexadecimal = "A" + hexadecimal;
						break;
					case 11:
						hexadecimal = "B" + hexadecimal;
						break;
					case 12:
						hexadecimal = "C" + hexadecimal;
						break;
					case 13:
						hexadecimal = "D" + hexadecimal;
						break;
					case 14:
						hexadecimal = "E" + hexadecimal;
						break;
					case 15:
						hexadecimal = "F" + hexadecimal;
						break;
					}
				}
				decimal /= 16;
			}
		}
		System.out.println("Số thập lục phân tương ứng là: " + hexadecimal);
		
		//ngược lại
//		
//		System.out.println("Nhập một số dưới dang thập  lục phân: ");
//		String hexadecimals = input.next();
//		
//		int decimals = 0;
//		if(hexadecimal == "0") {
//			decimal = 0;
//		} else {
//			for( int i = 0; i < hexadecimal.length(); i++) {
//				char hexChar = hexadecimal.
//			}
//		}
		input.close();
	}

}
