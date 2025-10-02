package com.logicBuildingExercises;

public class IntegerToRoman {

	public static void main(String[] args) {
		int num = 23;
		String symbols[] = { "L", "X", "V", "I" };
		int values[] = { 50, 10, 5, 1 };
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num = num - values[i];
				sb.append(symbols[i]);
			}
		}

		System.out.println(sb.toString());

	}

}
