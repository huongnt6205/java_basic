package chapter3andchapter4exercises;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số bạn muốn dự đoán: ");
		int guess = input.nextInt();
		
		int lottery;
		do {
			lottery = (int) (Math.random() * 90) + 10;
		}while (lottery % 10 == lottery / 10);
		
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("Kết quả xổ số là: " + lottery);
		
		if (guess == lottery) {
			System.out.println("Chúc mừng! Bạn đã trúng xổ số $10,000! ");
		} else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
			System.out.println("Chúc mừng! Bạn đã trúng xổ số $3,000! ");
		} else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) 
				|| (guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit1)) {
			System.out.println("Chúc mừng! Bạn đã trúng xổ số $1,000! ");
		} else {
			System.out.println("Chúc bạn may mắn lần sau!");
		}
		
		input.close();
	}
}