package chapter5exercises;

public class ApproximateTheSquareRoot {

	public static double sqrt(int n) {
		double lastGuess = n;
		double nextGuess;

		do {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if (Math.abs(nextGuess - lastGuess) < 0.0001) {
				break;
			}

			lastGuess = nextGuess;

		} while (true);

		return nextGuess;
	}

	public static void main(String[] args) {

		System.out.printf("Căn bậc hai của 25 là: %.3f \n", sqrt(25));
		System.out.printf("Căn bậc hai của 49 là: %.3f \n", sqrt(49));
		System.out.printf("Căn bậc hai của 2 là: %.3f \n", sqrt(2));
		System.out.printf("Căn bậc hai của 10 là: %.3f \n", sqrt(10));
	}

}

