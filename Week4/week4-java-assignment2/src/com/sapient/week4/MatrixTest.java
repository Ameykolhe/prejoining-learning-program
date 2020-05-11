package com.sapient.week4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

public class MatrixTest {

	private Matrix a, b;

	@After
	public void tearDown() throws Exception {
		a = null;
		b = null;
	}

	@Test
	public void testMatrix() {
		a = new Matrix();
		
		assertEquals(3, a.getMat().length);
		assertEquals(3, a.getMat()[0].length);
	}

	@Test
	public void testMatrixIntInt() {
		a = new Matrix(5, 10);
		assertEquals(5, a.getMat().length);
		assertEquals(10, a.getMat()[0].length);
	}

	@Test
	public void testMatrixIntArrayArray() {
		int [][]aMat = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		a = new Matrix(aMat);
		assertTrue(aMat == a.getMat());
	}

	@Test
	public void testMatrixMatrix() {
		a = new Matrix(5, 10);
		b = new Matrix(a);
		
		assertTrue(a != b && a.equals(b));
	}

	@Test
	public void testAdd() {
		int [][]aMat = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int [][]bMat = {
				{9, 8, 7},
				{6, 5, 4},
				{3, 2, 1}
		};
		
		int [][]expectedMat = {
				{10, 10, 10},
				{10, 10, 10},
				{10, 10, 10}
		};
		
		a = new Matrix(aMat);
		b = new Matrix(bMat);
		
		Matrix expectedResult = new Matrix(expectedMat);
		Matrix actualResult = a.add(b);
		
		assertEquals(expectedResult, actualResult);
	}
	

	@Test
	public void testMultiply() {
		int [][]aMat = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int [][]bMat = {
				{9, 8, 7},
				{6, 5, 4},
				{3, 2, 1}
		};
		
		int [][]expectedMat = {
				{90, 114, 138},
				{54, 69, 84},
				{18, 24, 30}
		};
		
		a = new Matrix(aMat);
		b = new Matrix(bMat);
		
		Matrix expectedResult = new Matrix(expectedMat);
		Matrix actualResult = b.multiply(a);
		
		assertEquals(expectedResult, actualResult);
	}

}
