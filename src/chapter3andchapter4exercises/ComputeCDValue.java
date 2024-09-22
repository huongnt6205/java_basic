package chapter3andchapter4exercises;

import java.util.Scanner;

public class ComputeCDValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập số tiền muốn gửi $: ");
		double 	amount = input.nextDouble();
		
		System.out.print("Nhập lợi nhuận hàng năm(%): ");
		double annual = input.nextDouble();
		
		System.out.print("Nhập thời gian đáo hạn(tháng): ");
		int numberOfMonth = input.nextInt();
		
		System.out.println("\n Month \t CD Value");
		
		double amountCDValue = amount;
		
		for(int month = 1; month <= numberOfMonth; month++) {
			amountCDValue = amountCDValue + amountCDValue * annual / 1200;
			System.out.printf(" %d \t %.2f", month, amountCDValue);
			System.out.println();
		}
		
		input.close();
	}

}
