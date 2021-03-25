package sample1;

public class demo1 {

	public static void main(String[] args) {
		Matrix1 obj = new Matrix1(2, 2);
		obj.matrixCreation();
		Matrix1 obj1 = new Matrix1(obj);
		Matrix1 obj2 = obj.matmul(obj1);
		obj.display();
		obj1.display();
		obj2.display();
		obj = null;
		System.gc();

	}

}
