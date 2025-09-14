package com.logicBuildingExercises;

public class LengthOfLastWordInString {

	public static void main(String[] args) {

		System.out.println(lengthOfLastWord("     Hello      world       "));
	}

	private static int lengthOfLastWord(String str) {
		String s1 = str.trim();
		char[] chr = s1.toCharArray();
		int count = 0;
		for (int i = chr.length - 1; i >= 0; i--) {
			if (chr[i] != ' ') {
				count++;
			} else {
				if (count > 0) {
					break;
				}
			}
		}

		return count;
	}

}
