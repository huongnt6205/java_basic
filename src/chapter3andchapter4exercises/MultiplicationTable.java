package chapter3andchapter4exercises;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("          Multiplication Table");
		System.out.print("   ");
		
		for(int j = 1; j <= 9; j++) 
			System.out.print("   " + j);
		
		System.out.println("\n-----------------------------------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + " |");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
		
		System.out.println();
		int z = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.println("i * j = " + i * j );
				z++;				
			}
		}
		System.out.println("Tổng số lần in là: " + z);
	}

}
