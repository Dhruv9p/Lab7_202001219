package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class p5_test {

	@Test
	public void test() {
		unittesting obj1= new unittesting();
		String s1="abc",s2="abcd";
		boolean outputf=obj1.prefix(s1,s2);
		assertEquals(true,outputf);
	}
	
	@Test
	public void test2() {
		unittesting obj1= new unittesting();
		String s1="",s2="abcd";
		boolean outputf=obj1.prefix(s1,s2);
		assertEquals(true,outputf);
	}
}
