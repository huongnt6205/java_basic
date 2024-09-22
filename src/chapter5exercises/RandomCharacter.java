package chapter5exercises;

public class RandomCharacter {

	public static char randomCharacter(char ch1, char ch2) {
		
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
		
	}
	
	public static char ranomCharacterUpperCase() {
		return randomCharacter('A', 'Z');
	}
	
	public static char randomCharacterDigit() {
		return randomCharacter('0', '9');
	}
	
	public static void main(String[] args) {
		
		int count1 = 0;
		System.out.println("100 chữ cái in hoa ngẫu nhiên là: ");
		for(int i = 1; i <= 100; i++) {
			System.out.print(ranomCharacterUpperCase() + " ");
			count1++;
			
			if(count1 % 10 == 0) {
				System.out.println();
			}
		}
		
		int count2 = 0;
		System.out.println("\n100 chữ số ngẫu nhiên là: ");
		for(int i = 1; i <= 100; i++) {
			System.out.print(randomCharacterDigit() + " ");
			count2++;
			
			if(count2 % 10 == 0) {
				System.out.println();
			}
		}
	}
}
