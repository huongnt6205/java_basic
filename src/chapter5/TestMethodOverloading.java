package chapter5;

public class TestMethodOverloading {

	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}

	}

	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}

	}

	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

	public static void main(String[] args) {

		System.out.println("Giá trị lớn nhất giữa 3 và 4 là: " + max(3, 4));

		System.out.println("Giá trị lớn nhất giữa 3.0 và 5.4 là: " + max(3.0, 5.4));
		
		System.out.println("Giá trị lớn nhất giữa 3.0 và 4.5 và 10.14 là: " + max(3.0, 4.5, 10.14));
		
		System.out.println("Giá trị lớn nhất giữa 2 và 3.5 là: " + max(2, 3.5));

	}

}
