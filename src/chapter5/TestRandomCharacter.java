package chapter5;

public class TestRandomCharacter { 
	
	public static void main(String[] args) {
		final int NUMBER_OF_CHAR = 175;
		final int CHARS_PER_LINE = 25; //biến đếm
		
		for(int i = 0; i < NUMBER_OF_CHAR; i++) {
			char ch = RandomCharacter.getRandomLowerCaseLetter();
			
			if((i + 1) % CHARS_PER_LINE == 0) {
				System.out.println(ch);
			} else {
				System.out.print(ch);
			}
		}
	}
}
