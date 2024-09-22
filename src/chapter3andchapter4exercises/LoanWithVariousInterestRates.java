package chapter3andchapter4exercises;

import java.util.Scanner;

public class LoanWithVariousInterestRates {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập một số nguyên: ");
		int number = input.nextInt();

		int originalNumber = number;
		
		System.out.println("Các yếu tố của " + originalNumber + " là: ");
		
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number /= i;
			}
		}

		input.close();
	}

}
