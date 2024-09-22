package chapter4;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/***************************/
		int count = 0;
		for (int number1 = 1; number1 <= 7; number1++) {
			for (int number2 = number1 + 1; number2 <= 7; number2++) {
				System.out.print(number1 + "" + number2 + "\t");
				count++;
			}
			System.out.println();
		}
		System.out.println("Tổng số các tổ hợp là: " + count);
		
		/*****************************/
		System.out.println("Nhập một số nguyên để chuyển sang dang bit: ");
		short n = input.nextShort();
		
		String bits = "";
		for(int i = 1; i <= 16; i++) {
			bits = (n & 1) + bits;
			n >>= 1;
		}
		System.out.println("Số bit là: " + bits);
		
		input.close();
	}

}
