package sample1;

import java.lang.Math;

public class CheckNumber {
	int number;
	public boolean res = false;
	
	
	// Getter and Setter 
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// Checking Even
	public void  checkEven() {
		if(number % 2 == 0 ) this.res = true;
		
	}
	// Checking Armstrong
	public void  checkArmstrong() {
		int verify = 0;
		int intermediate;
		int copy = this.number;
		while(copy > 0) {
			intermediate = copy%10;
			copy=copy/10;
			verify =  verify + (int) Math.pow(intermediate, 3);
		}
		if(verify==number) this.res = true; 
			
	}
	// checking Palindrome
	public void checkPalindrome() {
		int result=0;
		int rem;
		int copy= this.number;
		while(copy > 0) {
			rem = copy%10;
			result=(result * 10)+rem;
			copy = copy/10;
		}
		if (result==this.number) this.res=true;
				
	}
	
	// Display
	public void display() {
		System.out.println("The given number "+number+ " for given checking condition is "+ res);
	}

}
