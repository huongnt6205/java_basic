package chapter5exercises;

public class MersennePrime {

	public static boolean isPrime(int p) {

		if (p < 1) {
			return false;
		}
		if (p == 2) {
			return true;
		}
		if (p % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(p); i += 2) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isMersenne(int p) {

		int mersenneNumber = (int) Math.pow(2, p) - 1;

		return isPrime(mersenneNumber);
	}

	public static void main(String[] args) {

		System.out.println("p \t p^2 - 1");

		for (int p = 2; p <= 31; p++) {
			if (isPrime(p) && isMersenne(p)) {
				int mersennePrime = (int) Math.pow(2, p) - 1;
				System.out.printf("%d \t %d\n", p, mersennePrime);
			}
		}
	}

}
