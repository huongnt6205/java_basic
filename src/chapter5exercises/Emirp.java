package chapter5exercises;

public class Emirp {

	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}
		if (number <= 2) {
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

	public static boolean isNotPalindromic(int number) {

		String numString = Integer.toString(number);

		int left = 0;
		int right = numString.length() - 1;

		while (left < right) {
			if (numString.charAt(left) != numString.charAt(right)) {
				return true;
			}
			left++;
			right--;
		}
		return false;
	}

	 public static int reverseNumber(int number) {
	        int reversed = 0;
	        while (number != 0) {
	            reversed = reversed * 10 + number % 10;
	            number /= 10;
	        }
	        return reversed;
	    }
	
	public static boolean isEmirp(int number) {

		if (isPrime(number) && isNotPalindromic(number)) {
			int reveser = reverseNumber(number);
			
			return isPrime(reveser);
		}
		return false;
	}

	public static void main(String[] args) {
		final int TOTAL_NUMBER_PRIME = 100;

		int count = 0;
		int number = 2;
		while (count < TOTAL_NUMBER_PRIME) {
			if (isEmirp(number)) {
				System.out.printf("%-5d", number);
				count++;

				if (count % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}

	}

}
