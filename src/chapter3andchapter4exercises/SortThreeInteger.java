package chapter3andchapter4exercises;

import javax.swing.JOptionPane;

public class SortThreeInteger {

	public static void main(String[] args) {
		
		String number1 = JOptionPane.showInputDialog("Nhập vào số nguyên num1: ");
		int num1 = Integer.parseInt(number1);
		
		String number2 = JOptionPane.showInputDialog("Nhập vào số nguyên num2: ");
		int num2 = Integer.parseInt(number2);
		
		String number3 = JOptionPane.showInputDialog("Nhập vào số nguyên num3: ");
		int num3 = Integer.parseInt(number3);
		int temp = 0;

		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if(num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		 System.out.printf("Thứ tự số đã sắp xếp là %d <= %d <= %d\n", num1, num2, num3);
		
	}

}
