package chapter5;

public class printNumerRandom {

	public static void main(String[] args) {
		
		int number1 = (int) (Math.random() * 22) + 34;
		
		System.out.println("Số ngẫu nhiên nhận được là: " + number1);
		
		int number2 = (int) (Math.random() * 1000);
		
		System.out.println("Số ngẫu nhiên nhận được là: " + number2);
		
		double number3 = (double) (Math.random() * 50.0) + 5.5;
		
		System.out.println("Số thực ngẫu nhiên vừa nhận được là: " + number3);
		
		char charRandom1 = (char) ((Math.random() * 26) + 'a');
		char charRandom2 = (char) ((Math.random() * 26 ) + 'A');
		
		System.out.println("Ký tự vừa nhận được là: " + charRandom1);
		System.out.println("Ký tự vừa nhận được là: " + charRandom2);
		
		double number4 = Math.sin(2 * Math.PI);
		System.out.println("Trả về giá trị sin dưới dạng 1 góc radian: " + number4);
		
		double number5 = Math.sin(2 * Math.PI);
		System.out.println("Trả về giá trị cos dưới dạng 1 góc radian: " + number5);
	}
}
