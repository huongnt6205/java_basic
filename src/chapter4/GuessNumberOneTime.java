package chapter4;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = (int)(Math.random() * 101);
		
		System.out.println("Đoán một con số magic từ 0 đến 100: ");
		
		System.out.println("Nhập dự đoán của bạn: ");
		int guess = input.nextInt();
		
		if(guess == number) {
			System.out.println("Bạn đã đoán đúng! Số đó chính là " + number);
		} else if(guess > number) {
			System.out.println("Dự đoán của bạn quá cao!");
		} else {
			 System.out.println("Dự đoán của bạn quá thấp!");
		}
		input.close();
	}

}
