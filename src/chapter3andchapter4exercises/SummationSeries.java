package chapter3andchapter4exercises;

import java.util.Scanner;

public class SummationSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập một số nguyên: ");
		int number = input.nextInt();
		
		double sumLeftToRight = 0;
		for(double i = 1; i <= number; i++) {
			sumLeftToRight += (1 / i);
		}
		System.out.println("Tổng chuỗi từ trái sang phải là: " + sumLeftToRight);

		double sumRightToLeft = 0;
		for(double i = number; i >= 1; i-- ) {
			sumRightToLeft += (1 / i);
		}
		System.out.println("Tổng chuỗi từ phải sang trái là: " + sumRightToLeft);
		
		input.close();
	}

}
