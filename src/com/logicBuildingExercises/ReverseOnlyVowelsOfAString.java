package com.logicBuildingExercises;

public class ReverseOnlyVowelsOfAString {

	public static void main(String[] args) {
		String input = "Hello";
		String vowel = "aeiouAEIOU";
		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			if (vowel.indexOf(charArray[left]) == -1) {
				left++;
			} else if (vowel.indexOf(charArray[right]) == -1) {
				right--;
			} else {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
		}

		System.out.println(String.valueOf(charArray));

	}

}
