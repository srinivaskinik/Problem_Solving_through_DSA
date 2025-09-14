package com.logicBuildingExercises;

import java.math.BigInteger;

public class FactorialOfALargeNumber {

	public static void main(String[] args) {
		System.out.println(factorial(50));
	}

	public static BigInteger factorial(int num) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= num; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

}
