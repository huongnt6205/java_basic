package chapter5exercises;

import java.util.Scanner;

public class SalesAmountMethod {

	public static double computeCommission(double salesAmount) {
		double commissionRate = 0;
		
		
			if(salesAmount <= 5000) {
				commissionRate =salesAmount * 0.08;
			} else if(salesAmount <= 10000) {
				commissionRate = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
			} else {
				commissionRate = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
			}

		return commissionRate;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sales Amount \t Commission");

		for(double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			double commission = computeCommission(salesAmount);
			
			System.out.printf("%-10.1f \t %-12.1f \n", salesAmount , commission);
		}
			
		input.close();
	}

}
