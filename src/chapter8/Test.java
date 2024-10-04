package chapter8;

public class Test {
	class A {
		String s;
		
		A(String newS) {
			s = newS;
		}
		
		public void print() {
			System.out.println(s);
		}

	}
	
	 public static void main(String[] args) {
		Test test = new Test();
		 A a = test.new A("HI My name is Bap");
		 a.print();
	}
}
