package chapter6;

public class Example6 {
//	public static void main(String[] args) {
//		int number = 0;
//		int[] numbers = new int[1];
//		m(number, numbers);
//		System.out.println("number is " + number + " and numbers[0] is " + numbers[0]);
//	}
//
//	public static void m(int x, int[] y) {
//		x = 3;
//		y[0] = 3;
//	}
	public static void reverse(String[] list) {
		long start = System.nanoTime();

		for (int i = 0; i < list.length / 2; i++) {
			String temp = list[i];
			list[i] = list[list.length - i - 1];
			list[list.length - i - 1] = temp;
		}
		long time = System.nanoTime() - start;
		System.out.println(time);
	}



	public static void main(String[] args) {

		String[] list = { "1", "2", "3", "4", "5" };

		reverse(list);

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}
}	
/**
 * cho list = 1 2 3 4 5 newlisst = x1 x2 x3 x4 x5
 * 
 * i = 0 => x1 = 5 i = 1 => x2 = 4 i = 2 => x3 = 3 i = 3 => x4 = 2 i = 4 => x5 =
 * 1 Sau đó gán list = newlist => list = 5 4 3 2 1
 * 
 */
