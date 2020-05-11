package com.sapient.week4;

import com.sapient.week4.exceptions.AdditionException;
import com.sapient.week4.exceptions.CheckScalarException;
import com.sapient.week4.exceptions.MultiplicationException;

public class Matrix {
	private int [][]mat;
	
	
	public Matrix() {
		this.mat = new int[3][3];
	}
	
	
	public Matrix(int m, int n) {
		this.mat = new int[m][n];
	}
	

	public Matrix(int [][]mat) {
		this.mat = mat;
	}
	
	
	public Matrix(Matrix obj) {
		this.mat = new int[obj.mat.length][obj.mat[0].length];
		
		for (int i = 0; i < obj.mat.length; i++) {
			for (int j = 0; j < obj.mat[0].length; j++) {
				this.mat[i][j] = obj.mat[i][j];
			}
		}
	}
	
	
	public void readData() {
		System.out.println("Enter " + this.mat.length + " x " + this.mat[0].length + " matrix Content : ");
		for (int i = 0; i < this.mat.length; i++) {
			for (int j = 0; j < this.mat[0].length; j++) {
				this.mat[i][j] = Util.sc.nextInt();
			}
		}
	}
	
	
	public void displayData() {
		System.out.println("--------- Matrix ----------");
		for (int i = 0; i < this.mat.length; i++) {
			for (int j = 0; j < this.mat.length; j++) {
				System.out.print(" " + this.mat[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public Matrix add(Matrix obj) {
		int [][]ans = new int[this.mat.length][this.mat[0].length];
		
		if (this.mat.length != obj.mat.length && this.mat[0].length != obj.mat[0].length) {
			throw new AdditionException("Mismatched Matrix Dimensions : Cannot Add");
		}
		
		for (int i = 0; i < this.mat.length; i++) {
			for (int j = 0; j < this.mat.length; j++) {
				ans[i][j] = this.mat[i][j] + obj.mat[i][j];
			}
		}
		
		Matrix matAns = new Matrix(ans);
		return matAns;
	}
	
	
	public boolean checkScalar() {
		if (this.mat.length != this.mat[0].length) {
			throw new CheckScalarException("Input Matrix is not a square Matrix");
		}

		for (int i = 0; i < this.mat.length; i++) {
			if (this.mat[i][i] == 0) {
				return false;
			}
		}
		
		for (int i = 0; i < this.mat.length; i++) {
			for (int j = 0; j < this.mat.length; j++) {
				if (i != j && this.mat[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public Matrix multiply(Matrix obj) {
		int [][]ans = new int[this.mat.length][obj.mat[0].length];
		
		if (this.mat[0].length != obj.mat.length) {
			throw new MultiplicationException("Mismatched Matrix Dimensions : Cannot Multiply");
		}
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				for (int k = 0; k < this.mat[0].length; k++) {
					ans[i][j] += this.mat[i][k] * obj.mat[k][j];
				}
			}
		}
		
		Matrix ansMat = new Matrix(ans);
		return ansMat;
	}
	
	
	public int[][] getMat() {
		return mat;
	}

	
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		
		if (! (o instanceof Matrix)) {
			return false;
		}
		
		Matrix b = (Matrix) o;
		for (int i = 0; i < this.mat.length; i++) {
			for (int j = 0; j < this.mat[0].length; j++) {
				if (this.mat[i][j] != b.mat[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public void finalize() {
		this.mat = null;
	}
}
