package com.logicBuildingExercises;

import java.util.Arrays;

public class ArrayProblems {

	public static void main(String[] args) {
		int a[] = { 4, 5, 10, 3, 7 };

		// 1) calculate total sum of all elements
		// 2) Find largest and second largest no
		// 3) Reverse the first half of the array
		// 4) Reverse the second half of the array
		int totalSum = 0;
		for (int num : a) {
			totalSum += num;
		}
		System.out.println("total Sum: " + totalSum);

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : a) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			}
			if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		System.out.println("largest: " + largest);
		System.out.println("second largest: " + secondLargest);

		int left = 0;
		int mid = a.length / 2;
		int right = mid - 1;

		while (left < right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		System.out.println("Reverse first half of array: "+Arrays.toString(a));

		mid = a.length / 2;
		right = a.length - 1;
		left = mid;

		while (left < right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		System.out.println("Reverse second half of array: "+Arrays.toString(a));
	}

}
