package chapter4;

import java.util.Scanner;

public class EditFindTheSalesAmount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Nhập số lương cơ bản($): ");
		int baseSalary = input.nextInt();
		System.out.println();

		double salesAmount = 0.0;
		double totalIncome = 0.0;

		System.out.print("Nhập mức lương tối thiểu của 1 năm mà bạn muốn: ");
		double targetIncome = input.nextDouble();

//		System.out.println("Nhập yêu cầu về tiền hoa hồng: ");

//		do {
//			double commissionRate;
//			if (salesAmount <= 5000) {
//				commissionRate = 0.08;
//			} else if (salesAmount <= 10000) {
//				commissionRate = 0.10;
//			} else {
//				commissionRate = 0.12;
//			}
//
//			double commission = 0.0;
//
//			if (salesAmount <= 5000) {
//				commission = salesAmount * commissionRate;
//			} else if (salesAmount <= 10000) {
//				commission = 5000 * 0.08 + (salesAmount - 5000) * commissionRate;
//			} else {
//				commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * commissionRate;
//			}
//			totalIncome = baseSalary + commission;
//			salesAmount += 0.01;
//		} while (totalIncome < targetIncome);

		input.close();
		  for (salesAmount = 0.01; totalIncome < targetIncome; salesAmount += 0.01) {
	            double commissionRate;

	            if (salesAmount <= 5000) {
	                commissionRate = 0.08;
	            } else if (salesAmount <= 10000) {
	                commissionRate = 0.10;
	            } else {
	                commissionRate = 0.12;
	            }

	            double commission = salesAmount * commissionRate;
	            totalIncome = baseSalary + commission;
	        }
		System.out.printf("Tổng doanh thu cần thiết để đạt mức lương %.2f năm là: $%.2f\n", targetIncome, salesAmount);

		
	}

}
