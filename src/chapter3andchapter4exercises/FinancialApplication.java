package chapter3andchapter4exercises;

import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số tiền cần vay: $");
		double loanAmount = input.nextDouble();
		
		System.out.print("Thời hại vay (năm): ");
		double loanPeriod = input.nextDouble();
		
		System.out.println("Các khoản thanh toán hàng tháng: ");
		System.out.println(" Interest Rate \t Motnhly Payment \t Total Payment ");
		
	
		for(double rate = 5; rate <= 8; rate += 0.125) {
			
			double monthlyInterestRate =  rate/ 1200;
			
			double monthPayment = loanAmount * monthlyInterestRate / (1 - 1/ Math.pow(1 + monthlyInterestRate, loanPeriod));
//			System.out.printf("Số tiền phải thanh toán hàng tháng: %.2f ", monthPayment);
			
			double totalPayment =  monthPayment * 12;
//			System.out.printf("Tổng số tiền phải thanh toán là: %.2f", totalPayment);

			System.out.printf(" %.2f \t\t %.2f \t\t %.2f ",rate , monthPayment, totalPayment);
			 
			System.out.println();
		}
		input.close();
	}

}
