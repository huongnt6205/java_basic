package chapter2exercises;

import javax.swing.JOptionPane;

public class ComputeChange {
	public static void main(String[] args) {
		
		String amountString = JOptionPane.showInputDialog(null, "Nhập số tiền:", "Input", JOptionPane.QUESTION_MESSAGE);
		
		double amount = Double.parseDouble(amountString);
		
		int amounts = (int)(amount * 100);
		
		int numberOfOneDollars = amounts / 100;
		amounts = amounts % 100;
		
		int numberOfQuarters = amounts / 25;
		amounts = amounts % 25;
		
		int numberOfDimes = amounts / 10;
		amounts = amounts % 10;
		
		int numberOfNickels = amounts / 5;
		amounts = amounts % 5; 
		
		int numberOfPennies = amounts;
		String resultMessage = "Số tiền của bạn là : " + amount + " Bao gồm : \n"
				+ numberOfOneDollars + " Dollars \n"
				+ numberOfQuarters + " Quarters \n"
				+ numberOfDimes+ " Dimes \n"
				+ numberOfNickels +" Nickels \n"
				+ numberOfPennies + "Pennies";
		JOptionPane.showMessageDialog(null, resultMessage, "Output ", JOptionPane.INFORMATION_MESSAGE );
	}
}
