package chapter8;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("Trước khi tạo object");
		System.out.println("Số object của circle là: " + CircleWithStaticMembers.numberOfObjects);
		
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		
		System.out.println("\nSau khi tạo c1");
		System.out.println("c1: bán kính (" + c1.radius + ") và số  object của circle là: " + CircleWithStaticMembers.numberOfObjects + ")");
		
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		
		c1.radius = 9;
		
		System.out.println("\nSau khi tạo c2 và sửa đổi c1");
		System.out.println("c1: bán kính (" + c1.radius + ") và số  object của circle là: " + CircleWithStaticMembers.numberOfObjects + ")");
		System.out.println("c2: bán kính (" + c2.radius + ") và số  object của circle là: " + CircleWithStaticMembers.numberOfObjects + ")");
}
}
