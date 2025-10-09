package com.logicBuildingExercises;

import java.util.Arrays;

public class RotateTheArrayToLeftByKSteps {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int k = 3;
		k = k % a.length;
		// rotate array from 0 to k-1 times
		a = rotateLeftByK(a, 0, k - 1);
		System.out.println(Arrays.toString(a));
		// rotate array from 0 to k-1 times
		a = rotateLeftByK(a, k, a.length - 1);
		System.out.println(Arrays.toString(a));
		// rotate entire array
		a = rotateLeftByK(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

	private static int[] rotateLeftByK(int[] a, int left, int right) {
		int temp;
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		return a;
	}

}
