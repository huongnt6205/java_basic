package chapter2;

public class TestExample12 {

	public static void main(String[] args) {
		System.out.println("25 / 4 is " + 25 / 4);
		System.out.println("25 / 4.0 is " + 25 / 4.0);
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
		
		System.out.println(Math.pow(2, 3.5));
		
		double result = 25 / 4;
		System.out.println("Ket qua cua 25/4 la: " + result);
		double results = 25 / 4.0;
		System.out.println("Ket qua cua 25/4 _hangso_cach1 la: " + results);
		double resultss = 25 / 4f;
		System.out.println("Ket qua cua 25/4 _hangso_cach2 la: " + resultss);
		
		System.out.println(0xFFFF);
		
		System.out.println(5.2534e+1);
		System.out.println(0.52534e+2);
		System.out.println(525.34e-1);
		System.out.println(5.2534e+0);
	}
}
