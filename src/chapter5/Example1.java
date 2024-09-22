package chapter5;

public class Example1 {

	public static int sum(int i1, int i2) {
	int result = 0;
	
	for(int i = i1; i <= i2; i++)
		result += i;
	return result;
	}
	
	public static int  max(int num1, int num2) {
//		int max;
//		
//		if(num1 > num2) {
//			max = num1;
//		} else {
//			max  = num2;
//		}
//		
//		return max;
		
		return (num1 > num2) ? num1 : num2;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Tổng từ 1 đến 10 là: " + sum(1, 10));
		System.out.println("Tổng từ 20 đến 37 là: " + sum(20, 37));
		System.out.println("Tổng từ 35 đến 49 là: " + sum(35, 49));
		
		System.out.println("Số lớn nhất giữa 2 số là: " + max(10, 40));
		
		int i = 5;
		int j = 10;
		
		int max = max(i, j);
		
		System.out.println("Số lớn nhất giữa " + i + " và " + j + " là: " + max);
	}

}
