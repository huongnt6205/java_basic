package chapter3;

public class IntegerRandom {

	public static void main(String[] args) {
		
		int i = (int)(Math.random() * 20);
		System.out.println(i);
		
		int a = (int)(Math.random() * 10 + 10 );
		System.out.println(a);
		
		int b = (int)((Math.random() * 41) + 10);
		System.out.println(b);
	}

}
