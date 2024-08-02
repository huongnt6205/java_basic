package chapter2;
import java.util.Scanner;
public class ExampleCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap vao gia tri cua a:  ");
		int a = input.nextInt();
		System.out.print("Nhap vao gia tri cua b:  ");
		int b = input.nextInt();
		System.out.print("Nhap vao gia tri cua c:  ");
		int c = input.nextInt();
		System.out.print("Nhap vao gia tri cua d:  ");
		int d = input.nextInt();
		System.out.print("Nhap vao gia tri cua r:  ");
		int r = input.nextInt();

		double result = 4 / (r * (2 + 34)) - 9 * (a + b * c) + (3 + d * (2 + a)) / (a + b * d); 
		System.out.println("Kết quả của phép tính trên là: " + result);
		
		input.close();
	}
//4 / (3 * (2 + 34)) - 9 * (2 + 2 * 2) + (3 + 2 * (2 + 2)) / (2 + 2 * 2); 
}
