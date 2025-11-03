package com.logicBuildingExercises;

public class StringManipulation_Odd_Repeating {

	public static void main(String[] args) {
		String input = "99956";
		// If numbers are odd and repeating then should put -. So output will be 9-9-956

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length() - 1; i++) {
			result.append(input.charAt(i)); // append current character
			int currentNumber = Character.getNumericValue(input.charAt(i));
			int nextNumber = Character.getNumericValue(input.charAt(i + 1));

			if (currentNumber % 2 != 0 && nextNumber % 2 != 0 && currentNumber == nextNumber) {
				result.append("-");
			}
		}
		result.append(input.charAt(input.length() - 1));
		System.out.println(result.toString());

	}

}
