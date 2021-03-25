package inheritance;

public class Multiply extends Arithmetic {

	public Multiply() {
		super();
		System.out.println("I am in subclass zero argument constructor");
	}

	public Multiply(int num1, int num2) {
		super(num1, num2);
		System.out.println("I am in subclass two argument constructor");
	}

	public void cal() {

		n3 = n1 * n2;

	}

}