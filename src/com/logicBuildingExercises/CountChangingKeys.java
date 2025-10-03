package com.logicBuildingExercises;

public class CountChangingKeys {

	public static void main(String[] args) {
		//changing keys only when letters are changed, cases to be ignored in a string. 
		//eg: abBc count =2
		
		String input = "abBc";
		int count =0;
		char lastKey=input.toCharArray()[0];
		lastKey = Character.toLowerCase(lastKey);
		
		for(int i=1;i<input.length();i++) {
			char currentKey=input.toCharArray()[i];
			currentKey =Character.toLowerCase(currentKey);
			
			if(currentKey!=lastKey) {
				count++;
			}
			lastKey=currentKey;
		}
		System.out.println("Count of changing keys is "+count);

	}

}
