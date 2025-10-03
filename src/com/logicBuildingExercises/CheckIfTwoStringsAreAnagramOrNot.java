package com.logicBuildingExercises;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagramOrNot {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bac";
		System.out.println("Given strings are anagrams " + anagramCheck(s1, s2));

	}

	private static boolean anagramCheck(String s1, String s2) {
		if (s1.length() == s1.length()) {
			char s1CharArray[] = s1.toCharArray();
			char s2CharArray[] = s2.toCharArray();
			Arrays.sort(s1CharArray);
			Arrays.sort(s2CharArray);
			if (Arrays.equals(s1CharArray, s1CharArray)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
