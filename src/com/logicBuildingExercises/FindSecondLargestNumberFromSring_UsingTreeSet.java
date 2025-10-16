package com.logicBuildingExercises;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNumberFromSring_UsingTreeSet {

	public static void main(String[] args) {
		String input = "abc321";
		findSecondLargest(input);

	}

	private static void findSecondLargest(String input) {
		char charArray[] = input.toCharArray();
		int num;
		TreeSet<Integer> dataSet=new TreeSet<Integer>();
		for(char ch:charArray) {
			if(Character.isDigit(ch)) {
				num=ch-'0';
				dataSet.add(num);
			}
		}
		
		System.out.println(dataSet);
		//data that is there in the second last position is the second largest number
		dataSet.pollLast(); // retrieve and removes last element from the set
		System.out.println(dataSet.last()); //will give last element
	}

}
