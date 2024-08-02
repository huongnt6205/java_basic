package chapter2exercises;

import java.util.Scanner;
public class FinancialApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Số tiền gửi tiết kiệm ban đầu là: $");
		double moneys = input.nextDouble();
		
		System.out.print("Lãi suất hàng năm (5%): ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = (annualInterestRate/100)/12;
		System.out.println(monthlyInterestRate);
		
		double month1 = moneys * (1 + monthlyInterestRate);
		System.out.println("Tổng số tiền gửi tiết kiêm tháng đầu tiên là: $" + month1);
		
		double month2 = (moneys + month1) * (1 + monthlyInterestRate);
		System.out.println("Tổng số tiền gửi tiết kiêm tháng đầu tiên là: $" + month2);
		
		double month3 = (moneys + month2) * (1 + monthlyInterestRate);
		System.out.println("Tổng số tiền gửi tiết kiêm tháng đầu tiên là: $" + month3);
		
		double month4 = (moneys + month3) * (1 + monthlyInterestRate);
		System.out.println("Tổng số tiền gửi tiết kiêm tháng đầu tiên là: $" + month4);
		
		double month5 = (moneys + month4) * (1 + monthlyInterestRate);
		System.out.println("Tổng số tiền gửi tiết kiêm tháng đầu tiên là: $" + month5);
		
		double month6 = (moneys + month5) * (1 + monthlyInterestRate);
		System.out.println("Tổng số tiền gửi tiết kiêm tháng đầu tiên là: $" + month6);
		
		input.close();
	}
}
