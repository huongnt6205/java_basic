package chapter8;

public class Showerrors1 {
	
	int value;
	
	public Showerrors1(int value) {
		this.value = value;
	}
	
	public String toString() {
		return Integer.toString(value);
	}
	public static void main(String[] args) {
		Showerrors1 ex1 = new Showerrors1(5);
		
		System.out.println(ex1);
	}
}
