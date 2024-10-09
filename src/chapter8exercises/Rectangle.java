package chapter8exercises;

public class Rectangle {

	double width;
	double height;

	Rectangle() {
		width = 1;
		height = 1;
	}

	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return (width + height) * 2;
	}

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();
		System.out.printf("Diện tích HCN1 có chiều dài " + rectangle1.width + " và chiều rộng " 
			+  rectangle1.height + " =  %.2f", rectangle1.getArea());
		System.out.printf("\nChu vi HCN1 có chiều dài " + rectangle1.width + " và chiều rộng " 
			+  rectangle1.height + " =  %.2f", rectangle1.getPerimeter());

		Rectangle rectangle2 = new Rectangle(4, 40);
		System.out.printf("\nDiện tích HCN2 có chiều dài " + rectangle2.width + " và chiều rộng " 
			+  rectangle2.height + " =  %.2f", rectangle2.getArea());
		System.out.printf("\nChu vi HCN2 có chiều dài " + rectangle2.width + " và chiều rộng " 
			+  rectangle2.height + " =  %.2f", rectangle2.getPerimeter());

		Rectangle rectangle3 = new Rectangle(3.5, 35.9);
		System.out.printf("\nDiện tích HCN3 có chiều dài " + rectangle3.width + " và chiều rộng " 
			+  rectangle3.height + " =  %.2f", rectangle3.getArea());
		System.out.printf("\nChu vi HCN3 có chiều dài " + rectangle3.width + " và chiều rộng " 
			+  rectangle3.height + " =  %.2f", rectangle2.getPerimeter());

	}

}
