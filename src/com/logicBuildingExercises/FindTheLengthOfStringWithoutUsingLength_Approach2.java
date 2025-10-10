package com.logicBuildingExercises;

public class FindTheLengthOfStringWithoutUsingLength_Approach2 {

	public static void main(String[] args) {
		String input = "Hello";
		int count = 0;
		while (true) {
			try {
				input.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Length of String is :" + count);
				break;
			}
		}
	}

}
