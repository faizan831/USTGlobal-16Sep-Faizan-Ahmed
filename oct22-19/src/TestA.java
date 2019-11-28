
public class TestA {
		public static int add(int a, int b) {
			System.out.println("add(int a, int b) method");
			return a + b;
			
		}
		public static long add(int a, long b) {
			System.out.println("add(int a, int b) method");
			return a + b;
		}
		public static int add(int a, byte b) {
			System.out.println("add(int a, int b) method");
			return a + b;
		}
		public int multiply(int a ,int b) {
			System.out.println("multiply(int a, int b) method");
			return a * b;
		}
		public int multiply(byte a ,int b) {
			System.out.println("multiply(int a, int b) method");
			return a * b;
		}
		public static void main(String[] args) {
			System.out.println("main(String[] args) method");
			main(10);
			add(10, 40);
			add(1, 3);
			add(89, 90);
			TestA t = new TestA();
			t.multiply(12, 78);
			t.multiply(12, 6);

		}
		public static void main(int a) {
			System.out.println("main(int a) method");
		}
}
