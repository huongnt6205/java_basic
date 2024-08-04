package chapter4;

import java.util.Scanner; 

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		System.out.println("What is " + number1 + " + " + number2 + "?");
		
		System.out.println("Nhập answer: ");
		int answer = input.nextInt();
		
		while(number1 + number2 != answer) {
			System.out.println("Lỗi! Nhập lại! What is " + number1 + " + " + number2 + "?");
			System.out.println("Nhập answer: ");
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");
		
		input.close();
	}

}
