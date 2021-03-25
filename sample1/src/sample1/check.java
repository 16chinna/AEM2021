package sample1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class check {

CheckNumber obj= null;
	
	@Before
	public void before() {
		 obj = new CheckNumber();
	}
	@Test
	public void evenTest() {
		obj.setNumber(24);
		obj.checkEven();
		assertTrue(obj.res);
	}
	@Test
	public void evenTest1() {
		obj.setNumber(25);
		obj.checkEven();
		assertFalse(obj.res);
	}
	@Test
	public void armstrongTest1() {
		obj.setNumber(153);
		obj.checkArmstrong();
		assertTrue(obj.res);
	}
	@Test
	public void armstrongTest2() {
		obj.setNumber(372);
		obj.checkArmstrong();
		assertFalse(obj.res);
	}
	@Test
	public void palindromeTest1() {
		obj.setNumber(151);
		obj.checkPalindrome();
		assertTrue(obj.res);
	}
	@Test
	public void palindromeTest2() {
		obj.setNumber(372);
		obj.checkPalindrome();
		assertFalse(obj.res);
	}
	
		
	}




