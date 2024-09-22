package chapter5;

import java.util.Scanner;

public class computeTheFutureInvestmentValue {

	public static double futureInvestmentValue(double anountInvested, double monthlyInterestRate, double years) {
		double futureInvestmentValue = anountInvested;
		for (int i = 1; i <= years; i++) {
			futureInvestmentValue *= Math.pow((1 + monthlyInterestRate), 12);
			System.out.printf("%d \t %.3f \n", i, futureInvestmentValue);
		}
		return futureInvestmentValue;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Nhập số tiền đầu tư: ");
		double amountInvested = input.nextDouble();

		System.out.print("Nhập lãi suất hàng năm: ");
		double interestRate = input.nextDouble();

		System.out.print("Nhập số năm đầu tư: ");
		int years = input.nextInt();
		double monthlyInterestRate = interestRate / 1200;
		System.out.println(monthlyInterestRate);

		System.out.println("Year \t Future Value ");
		futureInvestmentValue(amountInvested, monthlyInterestRate, years);

		input.close();
	}

}
