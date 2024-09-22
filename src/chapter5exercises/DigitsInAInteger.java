package chapter5exercises;

import java.util.Scanner;

public class DigitsInAInteger {

	public static int sumDigits(int n) {
		int sum = 0;

		for (n = Math.abs(n); n > 0; n /= 10) {
			sum += n % 10;
		}

		return sum;
	}
	
	
	public static int resever(int number) {
		int reseved = 0;
		for(number = Math.abs(number); number > 0; number /= 10) {
			int digit = number % 10;
			
			reseved = reseved * 10 + digit;
		}
		return reseved;

	}
	
	public static boolean isPalindrome(int number) {
		return (number == resever(number));
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập một số nguyên để tính tổng của số đó: ");
		int number = input.nextInt();

		System.out.println("Tổng của số " + number + " mà bạn vùa nhập là: " + sumDigits(number));
		
		System.out.println("Số đối xứng của " + number + " là: " + isPalindrome(number));
		
		input.close();
	}
}
