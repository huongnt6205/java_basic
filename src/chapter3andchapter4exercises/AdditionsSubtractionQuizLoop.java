package chapter3andchapter4exercises;

import java.util.Scanner;

public class AdditionsSubtractionQuizLoop {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;

		long startTime = System.currentTimeMillis();
		String output = "";
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int) (1 + Math.random() * 15);
			int number2 = (int) (1 + Math.random() * 15);

			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			if (number1 + number2 == answer) {
				System.out.println("Bạn chọn đúng!");
				correctCount++;
			} else
				System.out.println("Bạn đã chọ sai!.\n" + number1 + " + " 
						+ number2 + " nên là:  " + (number1 + number2));
			count++;
			
			output += "\n" + number1 + "+" + number2 + "=" 
						+ answer + ((number1 + number2 == answer) ? " Đúng" : "Sai");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Số đếm đúng là: " + correctCount + "\nThời gian thử là:  " + 
						testTime / 1000 + " giây\n" + output);

		input.close();

	}

}
