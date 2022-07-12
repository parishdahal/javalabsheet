package methodoverloading;

public class MethodOverloading {
	
	private static void method(int a) {
		System.out.println("parish 019 348");
		System.out.println("The integer passed on this method is "+ a);
	}
	private static void method(int a, int b) {
		System.out.println("this is an example of method overloading");
		System.out.println("the integer passed on this method is " + a + " and " + b );
	}
	
	public static void main(String args[]) {
		method(8);
		method(5, 9);
	}
}
