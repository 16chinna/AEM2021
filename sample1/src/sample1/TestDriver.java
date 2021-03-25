package sample1;


public class TestDriver {
	public static void main(String[] args) {
		CheckNumber obj = new CheckNumber();
		CheckNumber obj1 = new CheckNumber();
		CheckNumber obj2 = new CheckNumber();
		
		obj.setNumber(153);
		obj.checkEven();
		obj.display();
		
		obj1.setNumber(153);
		obj1.checkArmstrong();
		obj1.display();
		
		obj2.setNumber(151);
		obj2.checkPalindrome();
		obj2.display();
	}
}
