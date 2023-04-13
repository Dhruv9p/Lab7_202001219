package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class p4_test {

	@Test
	public void test() {
		unittesting obj1= new unittesting();
		int a=3,b=4,c=5;  
		int outputf=obj1.triangle(a,b,c);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test2() {
		unittesting obj1= new unittesting();
		int a=3,b=3,c=3;
		int outputf=obj1.triangle(a,b,c);
		assertEquals(0,outputf);
	}
	
	@Test
	public void test3() {
		unittesting obj1= new unittesting();
		int a=2,b=2,c=5;
		int outputf=obj1.triangle(a,b,c);
		assertEquals(1,outputf);
	}
	
	@Test
	public void test4() {
		unittesting obj1= new unittesting();
		int a=10,b=4,c=5;
		int outputf=obj1.triangle(a,b,c);
		assertEquals(3,outputf);
	}


}
