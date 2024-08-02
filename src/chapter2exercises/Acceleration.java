package chapter2exercises;

import javax.swing.JOptionPane;

public class Acceleration {

	public static void main(String[] args) {
		
		String vantoc0 = JOptionPane.showInputDialog("Nhập vận tốc ban đầu: ");
		double v0 = Double.parseDouble(vantoc0);
		System.out.println("Vận tốc ban đầu là: " + v0 + "m/s");
		 
		String vantoc1 = JOptionPane.showInputDialog("Nhập vận tốc cuối: ");
		double v1 = Double.parseDouble(vantoc1);
		System.out.println("Vận tốc sau là: " + v1 + "m/s");
		
		String times = JOptionPane.showInputDialog("Nhập thời gian: ");
		double t = Double.parseDouble(times);
		System.out.println("Thời gian của vật di chuyển được là: " + t + "s");
		
		double a = (v1 - v0) / t;
		System.out.println("Gia tốc: " + a + "m/s2");
		
	}

}
