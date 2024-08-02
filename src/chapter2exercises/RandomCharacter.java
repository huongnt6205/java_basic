package chapter2exercises;

public class RandomCharacter {

	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		
		int range = 26;
		int baseAscii = 65;
		 
		int randomIndex = (int) (currentTimeMillis % range);
		char randomUppercaseLetter =  (char)(baseAscii + randomIndex);
		System.out.println("Hiển thị chữ cái in hoa ngẫu nhiên: " + randomUppercaseLetter);
	}

}
