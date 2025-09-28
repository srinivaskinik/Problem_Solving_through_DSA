package com.logicBuildingExercises;

import java.util.Arrays;

public class ReverseAnArrayUsingTwoPointer {

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 40 };
		int left = 0;
		int right = input.length - 1;
		while (right > left) {
			int temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}

		for (int num : input) {
			System.out.print(num + " ");
		}
	}

}
