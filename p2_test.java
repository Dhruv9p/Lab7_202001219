package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class p2_test {

	@Test
	public void test() {
		unittesting obj1= new unittesting();
		int[] arr={1,5,6,5,2};   
		int outputf=obj1.countItem(5,arr);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test2() {
		unittesting obj1= new unittesting();
		int[] arr={0,0,0,0,0};   
		int outputf=obj1.countItem(0,arr);
		assertEquals(5,outputf);
	}
	
	@Test
	public void test3() {
		unittesting obj1= new unittesting();
		int[] arr={1,2,3,4,5};   
		int outputf=obj1.countItem('a',arr);
		assertEquals(2,outputf);
	}
	
	@Test
	public void test4() {
		unittesting obj1= new unittesting();
		int[] arr=null;   
		int outputf=obj1.countItem(3,arr);
		assertEquals(2,outputf);
	}

}
