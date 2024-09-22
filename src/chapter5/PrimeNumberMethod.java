package chapter5;

import java.util.Scanner;

public class PrimeNumberMethod {
	
	public static int printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		
		int count = 0;
		int number = 2;
		
		while (count < numberOfPrimes) {
			if(isPrime(number)) {
				count++;
				
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.printf("%-5s\n", number);
				} else {
					System.out.printf("%-5s", number);
				}
			}
			number++;
		}
		return count;
	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= Math.sqrt(number); divisor++ ) {
			if(number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("50 số nguyên tố đầu tiên là: ");
		printPrimeNumbers(50);
		
		input.close();
	}
}
