package chapter1;

public class PrintATable {

	public static void main(String[] args) {
		
		System.out.println("a \ta^2 \ta^3 ");
		for(int a = 1; a <= 4; a++) {
			int a2 = a * a;
			int a3 = a * a * a;
			System.out.println( a + "\t" + a2 + "\t" + a3);
		}
		/*****************************/
		double result = (9.5 * 4.5 - 2.5 * 3) / (44.5 - 3.5);
		System.out.println("\nKết quả của biểu thức là: " + result);
		
		/*******************************/
		int sum = 0;
		for(int i = 0; i <= 9; i++) {
			sum += i;
		}
		System.out.println("\nTổng từ 1 đến 9 là: " + sum);
		
		/***************************/
		double pi = 0.0;
		for(int i = 0; i < 100000; i++) {
			if(i % 2 == 0 ) {
				pi += 1.0 / (2 * i + 1);
			} else {
				pi -= 1.0 / (2 * i + 1);
			}
		}
		pi *= 4;
		System.out.println("\nGiá trị của pi là: " + pi);
	}

}
