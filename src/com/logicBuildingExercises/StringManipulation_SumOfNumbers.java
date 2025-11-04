package com.logicBuildingExercises;

public class StringManipulation_SumOfNumbers {

	public static void main(String[] args) {
		String input="QWE12RT350Y10";
		//sum of integers
		int sum=0;
		StringBuilder sb = new StringBuilder();
		for(char c:input.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(c);
			} else {
				if(sb.length()>0) {
					sum=sum+Integer.parseInt(sb.toString());
					sb.setLength(0);
				}
			}
		}
		
		//sum for the last integer block
		if(sb.length()>0) {
			sum=sum+Integer.parseInt(sb.toString());
		}
		System.out.println(sum);

	}

}
