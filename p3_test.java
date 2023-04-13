package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class p3_test {

	@Test
	public void test() {
		unittesting obj1= new unittesting();
		int[] arr={12,24,2,89,34,45};   
		int outputf=obj1.binarySearch(2,arr);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test2() {
		unittesting obj1= new unittesting();
		int[] arr={12,24,2,89,34,45};   
		int outputf=obj1.binarySearch(34,arr);
		assertEquals(34,outputf);
	}
	
	@Test
	public void test3() {
		unittesting obj1= new unittesting();
		int[] arr={12,24,2,89,34,45};   
		int outputf=obj1.binarySearch(12,arr);
		assertEquals(12,outputf);
	}
	
	@Test
	public void test4() {
		unittesting obj1= new unittesting();
		int[] arr={};   
		int outputf=obj1.binarySearch(20,arr);
		assertEquals(20,outputf);
	}


}
