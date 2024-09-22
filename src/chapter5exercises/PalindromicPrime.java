package chapter5exercises;

public class PalindromicPrime {

	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean isPalindromic(int number) {

		String numString = Integer.toString(number);

		int left = 0;
		int right = numString.length() - 1;

		while (left < right) {
			if (numString.charAt(left) != numString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		final int TOTAL_NUMBER_PRIME = 100;

		int count = 0;
		int number = 2;
		while (count < TOTAL_NUMBER_PRIME) {
			if (isPrime(number) && isPalindromic(number)) {
				System.out.printf("%-7d", number);
				count++;

				if (count % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}

	}
}
