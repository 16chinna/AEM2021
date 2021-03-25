package inheritance;

public class Divide extends Arithmetic {

	public Divide() {
		super();
		System.out.println("I am in subclass zero argument constructor");
	}

	public Divide(int num1, int num2) {
		super(num1, num2);
		System.out.println("I am in subclass two argument constructor");
	}

	public void cal() {

		n3 = n1 + n2;

	}

}