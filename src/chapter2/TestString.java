package chapter2;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class TestString {

	public static void main(String[] args) {
		String mesage = "Welcome to Java!";
		System.out.println(mesage);
		
		JOptionPane.showMessageDialog(null, "Xin chào!");
		
		int response = JOptionPane.showConfirmDialog(null,"Bạn có phải là người máy không?"); 
		if(response == JOptionPane.YES_OPTION) {
			System.out.println("Vâng tôi là người máy!");
		}else {
			System.out.println("Không! Tôi không phải là người máy!");
		}
		
		//cách 1
		String name = JOptionPane.showInputDialog("Vui lòng nhập tên: ");
		System.out.println("Tên của bạn là: " + name );
		//cách 2
		String output = JOptionPane.showInputDialog(null, "Enter an input", "Input Dialog Demo", JOptionPane.QUESTION_MESSAGE);
		System.out.println("Nhập Họ: " + output);
		String s = "Welcome " + "To Note";
		System.out.println(s);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhật ký hôm nay: ");
		String a = input.next();
		
		System.out.println(a);
		String x = "Trang " + 1;
		System.out.println(x);
		
		input.close();
	}

}
