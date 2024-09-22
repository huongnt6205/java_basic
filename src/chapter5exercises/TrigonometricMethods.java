package chapter5exercises;

public class TrigonometricMethods {

	public static double printTableSin(int degrees) {

		double radian = Math.toRadians(degrees);
		double sin = Math.sin(radian);

		return sin;
	}

	public static double printTableCos(int degrees) {

		double radian = Math.toRadians(degrees);
		double cos = Math.cos(radian);

		return cos;
	}

	public static void main(String[] args) {

		System.out.printf("%-10s %-10s %-10s", "Degree", "Sin", "Cos");
		System.out.println("-------------------------------------");

		for (int degrees = 0; degrees <= 360; degrees += 10) {

			System.out.printf("%-10d %-10.4f %-10.4f \n", degrees, printTableSin(degrees), printTableCos(degrees));
		}
	}
}
