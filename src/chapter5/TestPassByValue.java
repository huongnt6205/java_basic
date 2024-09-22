package chapter5;

public class TestPassByValue {

	public static void increment(int n) {
		n++;
		System.out.println("n bên trong phương thức  là: " + n);
	}

	public static void swap(int n1, int n2) {
		System.out.println("\t Bên trong phương thức hoán đổi");

		System.out.println("Trước khi hoán đổi n1 là: " + n1 + " và n2 là: " + n2);

		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("Sau khi hoán đổi n1 là: " + n1 + " và n2 là: " + n2);
	}

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Trước khi gọi x là: " + x);

		increment(x);
		System.out.println("Sau khi gọi x là: " + x);

		int num1 = 1;
		int num2 = 2;

		System.out.println("\nTrước khi gọi phương thức hoán đổi num1 là:  " + num1 + " và num1 là: " + num2);

		swap(num1, num2);
		System.out.println("Sau khi hoán đổi num1 là: " + num1 + " và num2 là: " + num2);
	}

}
