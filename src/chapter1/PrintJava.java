package chapter1;

public class PrintJava {
	 public static void main(String[] args) {
		 	System.out.println("Welcome to Java");
		 	System.out.println("Welcomee to Computer Science");
		 	System.out.println("Programming is fun");
		 	
		 	/******************/
		 	String x ="Welcome to Java";
			for(int i = 0; i <= 5; i++) {
				System.out.println(x);
			}
			//Tính vận tốc km/h
			double t = 1 + (40 / 60) + (35 / 3600);
			System.out.println("\nThời gian vận động viên chạy được là: " + t +"h");
			
			double s = 24 * 1.6;
			System.out.println("Quãng đường vận động viên chạy được là: " + s + "km");
			
			double v = s / t;
			System.out.println("Vận tốc trung bình của vận động viên là: " + v + "km/h");
			
			
	 }
}
