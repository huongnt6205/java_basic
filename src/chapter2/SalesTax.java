package chapter2;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số tiền mua hàng: ");
		double moneyPuchaseAmount = input.nextDouble();
		
		Double	moneySalesTax = moneyPuchaseAmount * 0.06;
		System.out.println("Số tiền thuế ban đầu: " + moneySalesTax);
		System.out.println("Số tiền thuế là:  "  + (int)(moneySalesTax * 100) / 100.0);
		
		input.close();
	}

}
