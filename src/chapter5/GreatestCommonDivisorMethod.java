package chapter5;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {

	public static int gcd(int n1, int n2) {
		int gcd = 1;
		int k = 2;

		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
			k++;
		}
		return gcd;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Nhập số nguyên thứ nhất: ");
		int number1 = input.nextInt();

		System.out.println("Nhập số nguyên thứ hai: ");
		int number2 = input.nextInt();

		System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + gcd(number1, number2));

		input.close();
	}
}
