package chapter2;

import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {

	public static void main(String[] args) {
		String annualInterestRateString = JOptionPane.showInputDialog("Nhập lãi suất hang năm");
		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		
		//lãi suất hàng tháng
		double monthlyInterestRate = annualInterestRate / 1200;
		
		 String numberOfYearsString = JOptionPane.showInputDialog("Nhập số năm: ");
		 int  numberOfYears = Integer.parseInt(numberOfYearsString);
		 
		 String loanAmountString = JOptionPane.showInputDialog("Nhập số tiền vay: ");
		 double loanAmout = Double.parseDouble(loanAmountString);
		 
		 double monthlyPayment = loanAmout * monthlyInterestRate / (1 - 1/ Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		 double totalPayment = monthlyPayment * numberOfYears * 12;
		 
		 monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		 totalPayment = (int)(totalPayment * 100) / 100.0;
		 
		 String output = "Số tiền phải thanh toán hàng tháng là:  $" + monthlyPayment + "Tổng số tiền phải thanh toán là:  $" + totalPayment;        
		 JOptionPane.showMessageDialog(null, output);
	}

}
