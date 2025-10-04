package com.logicBuildingExercises;

public class SeparateNumericValuesFromAlphabets {

	public static void main(String[] args) {
		String input="Ra123j";
		char[] charArray = input.toCharArray();
		
		StringBuilder number = new StringBuilder();
		StringBuilder alphabet = new StringBuilder();
		
		for(char currentChar:charArray) {
			if(Character.isDigit(currentChar)) {
				number.append(currentChar);
			} else if(Character.isAlphabetic(currentChar)) {
				alphabet.append(currentChar);
			}
		}
		
		System.out.println("numberic String: "+number);
		System.out.println("alphabet String: "+alphabet);

	}

}
