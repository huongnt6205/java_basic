package chapter4;

import java.util.Scanner;

public class ClockCountdown {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Nhập số giây để đếm ngược:");
		int seconds = input.nextInt();
		
		for(int i = seconds; i >= 0; i--) {
			if(i == 0) {
				System.out.println("Hết giờ!");
			} else {
				System.out.println(i + " đếm ngược.");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				System.out.println("Luồng bị gián đoạn");
				exception.printStackTrace();
			}
		}
		input.close();
	}
}

/** 
 * try and catch: một phần của hệ thống xử lý ngoại lệ, quản lý lỗi và tình huống bất thường
 * 
 * try: Khối try chứa mã mà có thể gây ra lỗi hoặc ngoại lệ.
 *  Bạn đặt mã có thể gặp lỗi trong khối này.
 *  catch: Nếu có ngoại lệ xảy ra trong khối try, khối catch sẽ được thực thi. 
 *  Bạn có thể xử lý lỗi tại đây hoặc thực hiện các hành động khôi phục.
 *  
 *  Thread.sleep() có thể bị gián đoạn bất cứ lúc nào bởi một luồng khác, 
 *  và điều đó sẽ gây ra ngoại lệ InterruptedException. 
 *  Để đảm bảo chương trình không bị dừng đột ngột khi xảy ra ngoại lệ,
 *  bạn cần bao quanh phương thức này bằng một khối try-catch.
 */
 
