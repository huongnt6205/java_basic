package chapter8;

public class Circle {
	
	private double radius = 1;
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		System.out.println("Bán kính là: " + myCircle.getRadius());
	}
	
}
