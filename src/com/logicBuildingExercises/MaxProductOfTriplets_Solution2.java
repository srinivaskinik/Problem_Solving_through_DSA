package com.logicBuildingExercises;

import java.util.Arrays;

public class MaxProductOfTriplets_Solution2 {
	public static void main(String[] args) {
		int a[] = { -10, -3, 5, 6, -20 };
		int n = a.length;
		if (n < 3) {
			System.out.println("Min length required to calculate product triplet is 3");
			System.exit(0);
		}

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int number : a) {
			if (number > max1) {
				max3 = max2;
				max2 = max1;
				max1 = number;
			} else if (number > max2) {
				max3 = max2;
				max2 = max1;
			} else if (number > max3) {
				max3 = number;
			}
			if (number < min1) {
				min2 = min1;
				min1 = number;
			} else if (number < min2) {
				min2 = number;
			}
		}

		int resultOne = max1 * max2 * max3;
		int resultTwo = min1 * min2 * max1;

		System.out.println(Math.max(resultOne, resultTwo));

	}
}
