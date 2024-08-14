package chapter3andchapter4exercises;

public class numberSmallest {

	public static void main(String[] args) {
		
		int number = 1;
		int target = 12000;
		
		while(number * number <= target) {
			number++;
		}
		
		System.out.println("Số nguyên nhỏ nhất sao cho n^2 > 12000 là: " + number);
		
		int n = 0;
		while (Math.pow(n, 3) < target) {
			n++;
		}
		
		System.out.println("Số nguyên lớn nhất sao cho n^3 < 12000 là: " + n);
		
	}

}
