package chapter5exercises;

public class SumSeries {
	public static double sumSeries(double i) {
		double m = 0;

			for (int j = 2; j <= i + 1; j++) {
				m += (i / j);
			}

		return (double) m;
	}

	public static void main(String[] args) {

		System.out.println("i \t m(i)");
		System.out.println("------------------");
		for (double i = 1; i <= 20; i++) {

			double m = sumSeries(i);
			System.out.printf("%.0f \t %.4f\n", i, m);
		}

	}
}
