package com.sapient.week4;

public class MatrixRunner {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------- Matrix A ---------------------");
		Matrix a = new Matrix();
		a.readData();
		a.displayData();
		
		System.out.println("\n\n--------------------- Matrix B ---------------------");
		int [][]bMat = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		Matrix b = new Matrix(bMat);
		b.displayData();
		
		System.out.println("\n\n--------------------- Matrix C ---------------------");
		int [][]cMat = {
				{1, 0, 0, 0, 0},
				{0, 2, 0, 0, 0},
				{0, 0, 3, 0, 0},
				{0, 0, 0, 4, 0},
				{0, 0, 0, 0, 5}
		};
		Matrix c = new Matrix(cMat);
		c.displayData();
		
		System.out.println("\n\n-------------------- Operations --------------------");
		System.out.println("\nMatrix A + Matrix B");
		Matrix result = a.add(b);
		result.displayData();
		
		System.out.println("\nMatrix A * Matrix B");
		result = a.multiply(b);
		result.displayData();
		
		System.out.println("\nCheck if Matrix C is Scalar Matrix");
		boolean res = c.checkScalar();
		if (res) {
			System.out.println("Matrix C is Scalar");
		} else {
			System.out.println("Matirx C is not Scalar");
		}
	}
	
}
