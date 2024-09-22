package chapter3andchapter4exercises;

import java.util.Scanner;

public class LoanAmortizationSchedule {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số tiền cần vay: $");
		double loanAmount = input.nextDouble();
		
		System.out.print("Nhập hạn vay lãi(năm): ");
		int loanPeriod = input.nextInt(); 
		
		System.out.print("Lãi suất hàng năm:(%) ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.printf("Lãi suất hàng tháng là: %.2f", monthlyInterestRate);
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanPeriod * 12));
		System.out.printf("\nKhoản thanh toán hàng tháng là: %.2f ", monthlyPayment);
		
		input.close();
		
		double totalPayment = monthlyPayment * 12;
		System.out.printf("Tổng thanh toán là: %.2f", totalPayment);
		
		System.out.println("\n Payment \t Interest \t Principal \t Balance ");
		
		double balance = loanAmount;
		int payment;
		double interest, principal;
		
		for( payment = 1; payment <= loanPeriod * 12; payment++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.printf("%d \t\t %.2f \t\t %.2f \t %.2f", payment, interest, principal, balance);
			System.out.println();
		}

	}

}
