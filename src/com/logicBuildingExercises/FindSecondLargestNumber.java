package com.logicBuildingExercises;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int array[] = { 1, 3, 2, 7, 5 };
		int largestNo = Integer.MIN_VALUE;
		int secondLargestNo = Integer.MIN_VALUE;

		for (int number : array) {
			if (number > largestNo) {
				secondLargestNo = largestNo;
				largestNo = number;
			} else if (number > secondLargestNo && number != largestNo) {
				secondLargestNo = number;
			}
		}

		System.out.println("Largest =" + largestNo);
		System.out.println("Second Largest =" + secondLargestNo);

	}

}
