package chapter2exercises;

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhập tên nhân viên: ");
		String name = input.next();
		
		System.out.print("Số giờ làm việc trong một tuần: ");
		double hoursWorkInWeek = input.nextDouble();
		
		System.out.print("Mức lương hàng giờ: ");
		double hourPayRate = input.nextDouble();
		
		System.out.print("Tỷ lệ khấu trừ thuế liên bang: ");
		double  federalWithholdingRate = input.nextDouble();
		
		System.out.print("Tỷ lệ khấu trừ thuế tiểu bang: ");
		double stateWithholdingRate = input.nextDouble();
		
		double totalGrossPay = hourPayRate * hoursWorkInWeek; 
		System.out.print("Tên nhân viên" + name
				+ "\nSố giờ làm việc trong 1 tuần: " + hoursWorkInWeek
				+ "\nMức lương 1 giờ: " + hourPayRate
				+ "\nTổng mức lương: " + totalGrossPay);
		
		double federalWithholding = totalGrossPay * (federalWithholdingRate / 100);
		double stateWithholding = totalGrossPay * (stateWithholdingRate / 100);
		double totalDeduction = federalWithholding + stateWithholding;
		
		double netPay = totalGrossPay - totalDeduction;
				
		System.out.println("\nCác khoản khấu trừ: "
				+ "\n\tThuế liên bang: " + federalWithholding  
				+ "\n\tThuế tiểu bang: " + stateWithholding
				+ "\n\tTổng số khấu trừ: " +  totalDeduction
				+ "\nTổng lương: " +  netPay );
		
		input.close();
	}

}
