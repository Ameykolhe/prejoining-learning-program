package com.sapient.week4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

public class IntArrProcessTest {

	private IntArrProcess arr;
	
	@After
	public void tearDown() throws Exception {
		arr = null;
	}

	@Test
	public void testIntArrProcess() {
		arr = new IntArrProcess();
		assertEquals(10, arr.getArr().length);
	}

	@Test
	public void testIntArrProcessInt() {
		arr = new IntArrProcess(15);
		assertEquals(15, arr.getArr().length);
	}

	@Test
	public void testIntArrProcessIntArray() {
		int []array = {1, 2, 3};
		arr = new IntArrProcess(array);
		assertTrue(array == arr.getArr());
	}

	@Test
	public void testIntArrProcessIntArrProcess() {
		int []array = {1, 2, 3};
		arr = new IntArrProcess(array);
		IntArrProcess ob = new IntArrProcess(arr);
		assertTrue(arr != ob && arr.equals(ob) );
	}

	@Test
	public void testSort() {
		int []array = {30, 56, 12, 19, 70};
		arr = new IntArrProcess(array);
		assertArrayEquals(array, arr.getArr());
	}

}
