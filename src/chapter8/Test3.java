package chapter8;

public class Test3 {

	public static void swap1(Circles x, Circles y) {
		Circles temp = x;
		x = y;
		y = temp;
	}

	public static void swap2(Circles x, Circles y) {
		double temp = x.radius;
		x.radius = y.radius;
		y.radius = temp;
	}

	public static void main(String[] args) {
		Circles circle1 = new Circles(1);
		Circles circle2 = new Circles(2);

		swap1(circle1, circle2);
		System.out.println("Sau swap1: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
		
		swap2(circle1, circle2);
		System.out.println("Sau swap1: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
		
	}
}
