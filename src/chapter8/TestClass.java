package chapter8;

import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
public class TestClass {
	
	public static void main(String[] args) {
		
		//test date:
		Date date = new Date();
		System.out.println("Thời gian trôi qua kể từ ngày 1-1-1970 là: "
		+ date.getTime() +" milliseconds");
		System.out.println(date.toString());

		//test Random:
		Random random1 = new Random(3);
		System.out.print("random1: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(random1.nextInt(1000) + " ");
		}
		Random random2 = new Random(3);
		System.out.print("\nramdon2: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(random2.nextInt(1000) + " ");
		}
		//test Frame:
		JFrame frame1 = new JFrame();
		frame1.setTitle("window 1");
		frame1.setSize(200, 150);
		frame1.setLocation(200, 100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);

		JFrame frame2 = new JFrame();
		frame2.setTitle("window 2");
		frame2.setSize(200, 150);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
	
	
	}
}
