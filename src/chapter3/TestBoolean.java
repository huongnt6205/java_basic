package chapter3;

import java.util.Scanner;

public class TestBoolean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/**3.19******************/
		System.out.print("Câu 3.18 \nNhập một số nguyên: ");
		int num = input.nextInt();
		boolean result = (1 <= num) && (num <= 100);
		System.out.println("Đáp án: " + result + "!");
		
		/***3.20*****************/
		System.out.print("Câu 3.19 \nNhập một số nguyên: ");
		int number = input.nextInt()
				;
		if((1 <= number && number <= 100) || (number < 1)) {
			System.out.println("Đáp án: true!");
		}else {
			System.out.println("Đáp án:: false!");
		}
		
		input.close();
	}

}
