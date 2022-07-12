package inheritance;


class Arithmetic{
	int num1, num2, sum, multiplication;
	public void setter(int i, int j) {
		num1 = i;
		num2 = j;
	}
	public void sumResult() {
		System.out.println("the sum of the two integer is " + sum);
	}
	
	public void productResult() {
		System.out.println("the product of the two number is " + multiplication);
	}

}

class Add extends Arithmetic{
	void add() {
		sum = num1 + num2;
		
	}
}

class Multiplication extends Arithmetic{
	void multiply() {
		multiplication = num1 * num2;
	}
}

public class SimpleInheritance {
	public static void main(String[] args) {
		Add add =  new Add();
		add.setter(10, 2);
		add.add();
		add.sumResult();
		
		Multiplication multiplication = new Multiplication();
		
		multiplication.setter(10, 4);
		multiplication.multiply();
		multiplication.productResult();
		
		
	}
	
}
