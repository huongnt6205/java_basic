package chapter3andchapter4exercises;

public class PerfectNumberAndSummation {

	public static void main(String[] args) {

		for (int i = 1; i < 10000; i++) {
			int sum = 0;

			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.println(i + " là một số hoàn hảo!");
			}

		}

		/************************/
// 1 / (1 + sqrt(2) + 1 / (sqrt(2) + sqrt(3)) + 1 / (sqrt(3) + sqrt(4)) + ... +1 / (sqrt(624) + sqrt(625))
		double sum = 0;

		for (int i = 1; i < 625; i++) {
			sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println("Tổng = " + sum);

	}

}
