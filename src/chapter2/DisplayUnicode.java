package chapter2;

import javax.swing.JOptionPane;

public class DisplayUnicode {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, 
				"\u6B22\u8FCE \u03b1 \u03b2 \u03b3",
				"\u6B22\u8FCE Welcome",
				JOptionPane.INFORMATION_MESSAGE);
		
		char letter = 'A';
		System.out.println(letter);
		char chs = '\u0041';
		System.out.println(chs);
		
		char ch = 'a';
		System.out.println(++ch);
		
		System.out.println("Welcome to \"Java\"!");
		
		
//		Casting between char and Numeric Types
		char testChar = (char)0XAB0041;
		System.out.println(testChar);
		//chuyen doi gia tri so thuc sang ky tu
		char x = (char)65.25; 
		System.out.println(x);
		//chuyen doi từ ký tự sang kiểu số
		int y = (int)'A';
		System.out.println(y);
		//chuyển đỏi ngầm định và rõ ràng
		byte a = 'a';
		System.out.println(a);
		int m = 'a';
		System.out.println(m);
		
		
		int i = '2' + '3'; //(int)2 là 50 va (int)3 là 51 => '2' + '3' = 101
		System.out.println(i);
		int j = 2 + 'a'; //'a' trong UNI là 97
		System.out.println(" j là: " + j); // 2 + 97  = 99
		System.out.println( j + " là Unicode cho ký tự " + (char)j); //(char)j tức là (char)99 là c trong UNI
		
	}

}
