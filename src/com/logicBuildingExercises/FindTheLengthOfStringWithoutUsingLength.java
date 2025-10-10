package com.logicBuildingExercises;

public class FindTheLengthOfStringWithoutUsingLength {

	public static void main(String[] args) {
		String data="hello";
		char[] charArray=data.toCharArray();
		int count = 0;
		for(char c:charArray) {
			count++;
		}
		System.out.println(count);

	}

}
