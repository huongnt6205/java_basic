package chapter2exercises;

public class PrintTable {
	public static void main(String[] args) {
		System.out.println("a \tb \tpow(a, b)");
		
		for(int a = 1; a <= 5; a++) {
			int b = a + 1;
			double c = Math.pow(a, b);
			System.out.println(a + "\t" + b + "\t" + (int)c );
		}
	}
}
