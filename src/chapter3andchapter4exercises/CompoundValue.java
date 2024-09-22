package chapter3andchapter4exercises;

import java.util.Scanner;

public class CompoundValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số tiền gửi tiết kiệm: ");
		double amount = input.nextDouble();
		
		System.out.print("Nhập lãi suất hàng năm: ");
		double interestRateOfYear = input.nextDouble();
		
		System.out.print("Nhập số tháng gửi lãi: ");
		int numberOfMonth = input.nextInt();
		
		System.out.println("lãi suất hàng tháng là: ");
		double interestRateOfMonth = (interestRateOfYear / 100) / 12;
		
		double amountValue = 0;
		
		for (int month = 1; month <= numberOfMonth; month++) {
			amountValue = (amount + amountValue) * (1 + interestRateOfMonth);
			System.out.printf("Tháng thứ %d: Số tiền trong tài khoản là: %.3f$",month ,amountValue);
			System.out.println();
		}
		input.close();

	}

}
