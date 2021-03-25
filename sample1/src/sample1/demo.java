package sample1;

public class demo {

	public static void main(String[] args) {
		Matrix obj = new Matrix(2, 2);
		obj.matrixCreation();
		Matrix obj1 = new Matrix(obj);
		Matrix obj2 = obj.matAdd(obj1);
		obj.display();
		obj1.display();
		obj2.display();
		obj = null;
		System.gc();
		

	}

}
