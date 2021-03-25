package inheritance;

public class Demo {

	public static void main(String[] args) {
		Arithmetic obj = new Add(20, 30);
		// obj.setData(20, 30);
		obj.cal();
		obj.display();
		// tightly Coupled technique
		// Loosely Couple Technique or Likisov principle in solid principle
		obj = new Subtract(30, 20);
		obj.cal();
		obj.display();

	}

}