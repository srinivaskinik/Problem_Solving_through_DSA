package com.logicBuildingExercises;

public class DecodeTheString {

	public static void main(String[] args) {
		String input = "d3m4t2b0a1";
		// output d 3 times, m4times, t2times etc
		// dddmmmmtta
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i = i + 2) {
			char letter = input.charAt(i);
			int count = Character.getNumericValue(input.charAt(i+1));
			for (int j = 0; j < count; j++) {
				sb.append(letter);
			}
		}

		System.out.println(sb.toString());

	}

}
