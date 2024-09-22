package chapter5exercises;

public class TwinPrimes {

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

	public static void main(String[] args) {

		for (int number = 2; number < 1000; number++) {
			if (isPrime(number) && isPrime(number + 2)) {
				System.out.printf("(%d, %d) \n", number, number + 2);
			}
		}
	}
}
