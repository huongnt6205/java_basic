package chapter4;

public class TestSystemOutPrint {
	public static void main(String[] args) {
		
		double amount = 12918.98;
		double interrestRate = 0.0013;
		double interest = amount * interrestRate;
		System.out.printf("Interest is: %4.2f", interest);
	
		int count = 5;
		double piece = 1234.5678;
		System.out.printf("\nChugs ta có %d Dolar và %f Vàng ", count, piece);
		
	}
}
