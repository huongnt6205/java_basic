package chapter2;

public class PrintAscii {

	public static void main(String[] args) {
		
		//ASCII của các ký tự trong Java
		char numberChar = '1';
		System.out.println((int)numberChar);
		char charA = 'A';
		System.out.println((int)charA);
		char charB = 'b';
		System.out.println((int)charB);
		
		//Ký tự tương ứng mã số thập phân trong Java
		int charX = 40;
		char characterX = (char)charX;
		System.out.println(characterX);
		int charY = 90;
		char characterY = (char)charY;
		System.out.println(characterY);
		
		
		// ký tự tương ứng với các mã số thập lục phân (hexadecimal) trong Java
		int hexCode1 = 0x40;
		System.out.println((char)hexCode1);
		int hexCode2 = 0x5A;
		System.out.println((char)hexCode2);
		int hexCode3 = 0x71;
		System.out.println((char)hexCode3);
		int hexCode4 = 0x7A;
		System.out.println((char)hexCode4);
		
		int i = '1';
		System.out.println("\\ \"  " + i);
		
		int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
		System.out.println(j);
		
		char c = 90;
		System.out.println(c);
		
	}

}
