package com.question4;

public class FactorialOfANumber {

	public static void main(String[] args) {
		System.out.println(factorial(0));
	}

	public static int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}

}
