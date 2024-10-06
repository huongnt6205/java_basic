package chapter8;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
	
		System.out.println("Diện tích của hình tròn có bán kính " + myCircle.getRadius() + " là: " + myCircle.getArea());
		
		System.out.println("Số object được tạo ra là: " + CircleWithPrivateDataFields.getNUmberOfObject());
		
	}
}
