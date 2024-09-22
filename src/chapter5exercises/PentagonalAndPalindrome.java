package chapter5exercises;

public class PentagonalAndPalindrome {

	public static int getNumberPentagonal(int n) {

		return n * (3 * n - 1) / 2;
	}

	public static void main(String[] args) {

		final int NUMBER_PER_LINE = 10;
		final int TOTAL_NUMBER_PENTA = 100;

		for (int i = 1; i <= TOTAL_NUMBER_PENTA; i++) {

			System.out.printf("%-6d", getNumberPentagonal(i));

			if (i % NUMBER_PER_LINE == 0) {
				System.out.println();
			}
		}

	}
}
