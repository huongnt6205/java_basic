package chapter5exercises;

public class UseSqrtMethod {

	public static double printMethodSqrt(int number) {
		double result = Math.sqrt(number);

		return result;
	}

	public static void main(String[] args) {

		System.out.println("Numeber \t SquareRoot");
		for (int number = 0; number <= 20; number += 2) {

			System.out.printf("%-16d %.4f \n", number, printMethodSqrt(number));

		}
	}
}
