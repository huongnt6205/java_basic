package chapter3andchapter4exercises;

public class DisplayAsciiTable {

	public static void main(String[] args) {
		
		char char1 = (int) '!';
		char char2 = (int) '~';
		
		int int1 = (int) char1;
		int int2 = (int) char2;
		
		System.out.println("Mã ASCII của ký tự '!' là: " + int1 );
		System.out.println("Mã ASCII của ký tự '~' là: " + int2 );
		
		int count = 0;
		
		System.out.println("Bảng mã ASCII từ" + char1 + " đến " + char2 + ": " );
		
		for(int i = int1; i <= int2; i++) {
			System.out.print((char)i + " ");
			count++;
			
			if(count % 10 == 0) {
				System.out.println();
			}
		}
		
	}

}
