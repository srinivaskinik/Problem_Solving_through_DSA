package com.logicBuildingExercises;

public class StringManipulation_ReplceAt {

	public static void main(String[] args) {
		String input = "Tomorrow";
		StringBuilder result = new StringBuilder();
		int oCount=0;
		for(char c:input.toCharArray()) {
			if(c=='o' || c=='O') {
				oCount++;
				result.append("@".repeat(oCount));
			}
			else {
				result.append(c);
			}
		}
		
		System.out.println(result.toString());

	}

}
