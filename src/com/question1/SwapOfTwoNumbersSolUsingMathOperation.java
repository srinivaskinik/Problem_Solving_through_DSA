package com.question1;

public class SwapOfTwoNumbersSolUsingMathOperation {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		System.out.println("b=" + b);
		a = a - b;
		System.out.println("a=" + a);

	}

}
