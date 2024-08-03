package chapter3;

import java.util.Scanner;

public class TestBooleanOperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập một số nguyên: ");
		int numberInt = input.nextInt();
		
		if(numberInt % 2 == 0 && numberInt % 3 == 0) {
			System.out.println(numberInt + " chia hết cho 2 và 3!");
		}
		if(numberInt % 2 == 0 || numberInt % 3 == 0) {
			System.out.println(numberInt + " chia hết cho 2 hoặc 3!");
		}
		if(numberInt % 2 == 0 ^ numberInt % 3 == 0) {
			System.out.println(numberInt + " chia hết cho 2 or 3 nhưng không được chia hết cho cả 2!");
		}
		
		/**3.18**************/
		int x = 1;
		
		boolean result1 = (true) && (3 > 4);
		System.out.println("Kết quả của (true) && (3 > 4) là : " + result1);
		
		boolean result2 = !(x > 0) && (x > 0);
		System.out.println("Kết quả của !(x > 0) && (x > 0) là: " + result2);
		
		boolean result3 = (x > 0) || (x < 0);
		System.out.println("Kết quả của (x > 0) || (x < 0) là: " + result3);
		
		boolean result4 = (x != 0) || (x == 0);
		System.out.println("Kết quả của (x != 0) || (x == 0) là: " + result4);
		
		boolean result5 = (x >= 0) || (x < 0);
		System.out.println("Kết quả của (x >= 0) || (x < 0) là: " + result5);
		
		boolean result6 = (x != 1) == !(x == 1);
		System.out.println("Kết quả của (x != 1) == !(x == 1) là: " + result6);
		input.close();
	}
}
