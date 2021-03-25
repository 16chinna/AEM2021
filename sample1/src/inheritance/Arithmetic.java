package inheritance;

public class Arithmetic {
	public int n1, n2, n3;

	public Arithmetic() {
		n1 = 0;
		n2 = 0;
		n3 = 0;
		System.out.println("I am in superclass zero argument constructor");
	}

	public Arithmetic(int num1, int num2) {
		n1 = num1;
		n2 = num2;
		System.out.println("I am in superclass two argument constructor");
	}

	public void setData(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public void display() {
		System.out.println("n1 : " + n1 + " n2 : " + n2 + " n3 :" + n3);
	}

	public void cal() {

	};
}
