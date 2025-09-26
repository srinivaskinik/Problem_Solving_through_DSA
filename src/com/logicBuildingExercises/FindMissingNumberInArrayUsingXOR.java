package com.logicBuildingExercises;

public class FindMissingNumberInArrayUsingXOR {

	public static void main(String[] args) {
		int n = 6;
		int a[] = { 1, 2, 4, 5, 6 };
		int missingNumber = 0;
		for (int i = 0; i < a.length; i++) {
			missingNumber = missingNumber ^ a[i];
		}

		for (int i = 0; i <= n; i++) {
			missingNumber = missingNumber ^ i;
		}

		System.out.println(missingNumber);
	}

}
