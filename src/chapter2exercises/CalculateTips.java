package chapter2exercises;

import java.util.Scanner;
public class CalculateTips {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập tổng phụ thu: ");
		double subtotal = input.nextDouble();
		
		System.out.print("tỷ lệ tiền thưởng là: ");
		double gratuityRate = input.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100);
		
		double total = subtotal + gratuity;
		System.out.println("Tiền thưởng là: \u0024" + gratuity + " Tổng số tiền là: \u0024" + total);
		
		input.close();
	}
}
