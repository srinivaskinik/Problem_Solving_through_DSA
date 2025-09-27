package com.logicBuildingExercises;

public class SumOfArray {

	public static void main(String[] args) {
		int nums[] = { 1, 24, 33, 44 };

		int sum = 0;

		// Normal for
		// for (int index = 0; index < nums.length; index++) {
		// sum = sum + nums[index];
		// }

		// for each
		for (int num : nums) {
			sum = sum + num;
		}

		System.out.println(sum);
	}

}
