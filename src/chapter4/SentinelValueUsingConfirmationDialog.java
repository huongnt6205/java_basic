package chapter4;

import javax.swing.JOptionPane;

public class SentinelValueUsingConfirmationDialog {

	public static void main(String[] args) {
		int sum = 0;

		int option = JOptionPane.YES_OPTION; 
		
		while (option == JOptionPane.YES_OPTION) {
			String dataString = JOptionPane.showInputDialog("Nhập một số nguyên: ");
			int data = Integer.parseInt(dataString);
			sum += data;
			
			option = JOptionPane.showConfirmDialog(null, "Tiếp tục?");
					
		}
		JOptionPane.showMessageDialog(null, "The sum is " + sum);
	}

}
