package chapter4;

import java.util.Scanner;

public class TestConvertDoWhile {

	public static void main(String[] args) {

		/**
		 * Scanner input = new Scanner(System.in);
		 *int sum = 0;
		 * System.out.println("Enter an integer " + "(the input ends if it is 0)"); 
		 * int number = input.nextInt(); 
		 * while (number != 0) { 
		 * 		sum += number;
		 * 		System.out.println("Enter an integer " + "(the input ends if it is 0)");
		 * 		number = input.nextInt();
		 *  }
		 */
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Nhập một số nguyên (nếu nhập 0 chtrinh sẽ kết thúc): ");
		int number = input.nextInt();
		
		int sum = 0;
		
		do {
			sum += number;
			System.out.println("Nhập một số nguyên (nếu nhập 0 chtrinh sẽ kết thúc): ");
			number = input.nextInt();
		} while (number != 0);
		
		System.out.println("Tổng: " + sum);
		
		input.close(); 
	}

}
