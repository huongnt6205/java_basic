package chapter3;

import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số nguyên thứ nhất: ");
		int number1 = input.nextInt();
		System.out.print("Nhập số nguyên thứ hai: ");
		int number2 =input.nextInt();
		
		if(number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.println("Đáp án của " + number1 + "-" + number2 + "?");
		
		int answer = input.nextInt();
		
		if(number1 - number2 == answer) {
			System.out.println("Bạn đã đúng!");
		} else {
			System.out.println("Đáp án sai: " + number1 + " - " + number2 + "is" + (number1 - number2));
		}
		input.close();
	}
}
