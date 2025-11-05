package com.logicBuildingExercises;

public class StringManipulation_RemoveVowels {

	public static void main(String[] args) {
		String input = "programming is fun";
		// remove vowel letters and capitalize first letter
		StringBuilder result = new StringBuilder();

		for (String word : input.split(" ")) {
			StringBuilder temp = new StringBuilder();
			for (char c : word.toCharArray()) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				} else {
					temp.append(c);  
				}

//				if("aeiouAEIOU".indexOf(c) ==-1) {
//					temp.append(c);
//				}
			}

			if (temp.length() > 0) {
				temp.setCharAt(0, Character.toUpperCase(temp.charAt(0)));
			}

			result.append(temp).append(" ");
		}

		System.out.println(result.toString());

	}

}
