package com.sapient.week4;

public class IntArrProcessRunner {

	public static void main(String[] args) {
		IntArrProcess obj = new IntArrProcess(5);
		
		obj.readData();
		obj.displayHorizontal();
		obj.sort();
		obj.calcMinAndMax();
		obj.calcSum();
		obj.calcSecondBiggest();
		
	}

}
