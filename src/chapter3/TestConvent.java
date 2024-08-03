package chapter3;

import java.util.Scanner;

public class TestConvent {

	public static void main(String[] args) {
		
		System.out.println("Câu 3.30");
		/**
		 * x = 3; y = 3;
			switch (x + 3) {
			case 6: y = 1;
			default: y += 1;
			}
		 */
		int x = 3, y = 3;	
		if(x + 3 == 6) {
			System.out.println("y = 1");
		} else {
			System.out.println(y += 1);
		}
		
		System.out.println("Câu 3.31: ");
		/**
		 * int x = 1, a = 3;
			if (a == 1)
			x += 5;
			else if (a == 2)
			x += 10;
			else if (a == 3)
			x += 16;
			else if (a == 4)
			x += 34
		 */
		int a = 1, b = 3;
		switch(b) {
			case 1: System.out.println("Kết quả a = " + (a += 5)); break;
			case 2: System.out.println("Kết quả a = " + (a += 10)); break;
			case 3: System.out.println("Kết quả a = " + (a += 16)); break;
			case 4: System.out.println("Kết quả a = " + (a += 34)); break;
		}
			
		System.out.println("Câu3.32:");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhấp số ngày hôm nay: ");
		int day = input.nextInt();
		
		String dayName;
		switch(day) {
			case 0: {
				dayName = "Chủ nhật";
				break; 
			}
			case 1: {
				dayName = "Thứ Hai";
				break; 
			}
			case 2:  {
				dayName = "Thứ Ba";
				break; 
			}
			case 3:  {
				dayName = "Thứ Tư";
				break; 
			}
			case 4:  {
				dayName = "Thứ Năm";
				break; 
			}
			case 5:  {
				dayName = "Thứ Sáu";
				break; 
			}
			case 6:  {
				dayName = "Thứ Bảy";
				break; 
			}
			default:{
				dayName = "Ngày không hợp lệ";
				break;				
			}
		}
		System.out.println("Hôm nay la: " + dayName); 
		
		input.close();
	}

}
