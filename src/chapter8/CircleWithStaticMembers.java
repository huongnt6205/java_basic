package chapter8;

public class CircleWithStaticMembers {

	double radius;
	
	static int numberOfObjects = 0;
	
	CircleWithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}
	
	CircleWithStaticMembers(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfOfbiects() {
		return numberOfObjects;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}
