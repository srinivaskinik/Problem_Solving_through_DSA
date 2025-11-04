package com.logicBuildingExercises;

public class StringRotation {

	public static void main(String[] args) {
		String s1 = "INTERVIEW";
		String s2 = "VIEWINTER";
		// You have to check whether s2 string comes when s1 is rotated several times

		// logic is first check length and then check when s1 is concatenated two times
		// whether s2 is present.

		if ((s1.length() == s2.length()) && ((s1 + s1).contains(s2))) {
			System.out.println("Is a rotation string");
		} else {
			System.out.println("Is not a rotation string");
		}
	}

}
