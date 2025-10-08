package com.logicBuildingExercises;

import java.util.Arrays;

public class RotateTheArrayToRightByKSteps {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		k = k % a.length;
		a = rotateRightByK(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
		a = rotateRightByK(a, 0, k - 1);
		System.out.println(Arrays.toString(a));
		a = rotateRightByK(a, k, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	private static int[] rotateRightByK(int[] array, int left, int right) {
		int temp;
		while (left < right) {
			temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		return array;
	}
}
