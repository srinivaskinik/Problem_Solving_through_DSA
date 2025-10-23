package com.logicBuildingExercises;

public class LeaderInArray {

	public static void main(String[] args) {
		int a[] = { 16, 17, 4, 3, 5, 2 };
		//leader element is the element whose all right elements should be small. And last element is a leader by default
		int length = a.length;
		int maxRight = a[length - 1];
		System.out.print(maxRight + " ");
		for (int index = a.length - 2; index >= 0; index--) {
			if (a[index] > maxRight) {
				maxRight = a[index];
				System.out.print(maxRight + " ");
			}
		}
	}
}
