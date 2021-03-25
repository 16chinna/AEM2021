package inheritance;


public class Demo1 {
	public static void main(String[] args) {
		// Creating array of references
		Arithmetic obj1[] = new Arithmetic[4];

		// Assigning Objects to array elements
		obj1[0] = new Add();
		obj1[1] = new Subtract();
		obj1[2] = new Multiply();
		obj1[3] = new Divide();
		System.out.println("Choices : \n 1 -> Addition \n 2 -> Subtraction  \n 3 -> Multiplication \n 4-> Division");
		int ch = Read.sc.nextInt();
		System.out.println("Enter 2 numbers:");
		int n1 = Read.sc.nextInt();
		int n2 = Read.sc.nextInt();
		obj1[ch - 1].setData(n1, n2);
		obj1[ch - 1].cal();
		obj1[ch - 1].display();

	}
}

