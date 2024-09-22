package chapter5;

import java.util.Scanner;

public class Example3 {
	
	public static double salesCommission(int amount, double commissionRate) {
		double saleCommission = amount * ( commissionRate/100);
				
		return saleCommission;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/************************/
		System.out.print("Nhập số tiền bán hàng($): ");
		int amount = input.nextInt();
		
		System.out.print("Nhập tỷ lệ hoa hồng(%): ");
		double commissionRate = input.nextDouble();
		
		double saleCommission = salesCommission(amount, commissionRate);
		
		System.out.println("Hoa hồng kiếm được là: " + saleCommission +"$");
		
		input.close();
	}

}
