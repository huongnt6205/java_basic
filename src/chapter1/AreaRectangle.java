package chapter1;

import java.util.Scanner;

public class AreaRectangle {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			//Hinh chu nhat
			System.out.print("Nhật chiều dài: ");
			double width = input.nextDouble();
			System.out.print("Nhập chiều rộng: ");
			double height = input.nextDouble();
			
			double perimeter = (width + height) / 2;
			double area = width * height; 
			
			System.out.println("Chu vi hình chữ nhật là: " + perimeter);
			System.out.println("Diện tích hình chữ nhật là: " + area);
			
			//TÍnh vận tốc mile/giờ
			double minutes = (30 / 60) + 45;
			double t = minutes / 60; 
			System.out.println("\nSố giờ vận động viên chạy được là: " + t + "h");
			
			
			double s = 14 / 1.6;
			System.out.println("Số quang đường vận động viên chạy được là: " + s + "mile");
			
			double v = s / t;
			System.out.println("Vận tốc trung bình của vận động viên là: " + v + "mile/h");
			input.close();
		}
	
}
