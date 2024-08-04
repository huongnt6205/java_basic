package chapter4;

import java.util.Scanner;

public class GuessNumber {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int number = (int)(Math.random() * 101);
			
			System.out.println("Đoán một con số magic từ 0 đến 100");
			
			int guess = -1;
			while(guess != number) {
				System.out.println("Nhập dự đoán của bạn: ");
				guess = input.nextInt();
				
				if(guess == number) {
					System.out.println("Bạn đã đoán đúng! Số đó chính là " + number);
				} else if(guess > number) {
					System.out.println("Dự đoán của bạn quá cao!");
				} else {
					System.out.println("Dự đoán của bạn quá thấp!");
				}
				
			}
			
			input.close();
		}
}
