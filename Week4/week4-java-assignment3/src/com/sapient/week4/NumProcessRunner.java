package com.sapient.week4;

import java.util.Map;
import java.util.Scanner;


@FunctionalInterface
interface NumProcess {
	public int cal(int x, int y);
}


public class NumProcessRunner {
	
	public static int calculator(NumProcess operation, int x, int y) {
		return operation.cal(x, y);
	}

	public static void main(String[] args) {
		

		// Map<String, NumProcess> operations = Map.of("Add", (x, y) -> x + y, "Sub", (x, y) -> x - y, "Mul", (x, y) -> x * y, "Div", (x, y) -> x / y);
		
		Map<String, NumProcess> operations = Map.ofEntries(
				Map.entry("Add", (x, y) -> x + y),
				Map.entry("Sub", (x, y) -> x - y),
				Map.entry("Mul", (x, y) -> x * y),
				Map.entry("Div", (x, y) -> x / y)
		);
		
		int x, y, ans;
		String op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number : ");
		x = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		y = sc.nextInt();
		System.out.print("Enter operation : ");
		op = sc.next();
		
		sc.close();
		
		//ans = operations.get(op).cal(x, y);
		
		ans = NumProcessRunner.calculator(operations.get(op), x, y);
		
		System.out.println("Operation : " + op + ", Answer : " + ans);
		
	}

}
