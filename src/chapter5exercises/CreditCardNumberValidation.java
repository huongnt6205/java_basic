package chapter5exercises;

import java.util.Scanner;

public class CreditCardNumberValidation {

	public static boolean isValid(long number) {
		int totalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		
		return (totalSum % 10 == 0);
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;

		String numStr = Long.toString(number);

		for (int i = numStr.length() - 2; i >= 0; i -= 2) {
			int digit = Character.getNumericValue(numStr.charAt(i));
			sum += getDigit(2 * digit);
		}
		
		return sum;
	}

	public static int getDigit(int number) {
		if (number < 10) {
			return number;
		}
		return number / 10 + number % 10;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;

		String numStr = Long.toString(number);

		for (int i = numStr.length() - 1; i >= 0; i -= 2) {
			int digit = Character.getNumericValue(numStr.charAt(i));
			sum += getDigit(2 * digit);
		}
		
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	public static int getSize(long d) {
		return Long.toString(d).length();
	}

	public static long getPrefix(long number, int k) {
		if(getSize(number) > k) {
			return Long.parseLong(Long.toString(number).substring(0, k));
		}
		return number;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập số thẻ tín dụng của bạn: ");
		long numberCard = input.nextLong();

		if(isValid(numberCard)) {
			System.out.println("Số thẻ tín dụng: \" " + numberCard + " \" là hợp lệ!");
		} else {
			System.out.println("Số thẻ tín dụng: \" " + numberCard + " \" là không hợp lệ!");
		}
		
		input.close();
	}
}
