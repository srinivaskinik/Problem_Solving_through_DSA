package com.logicBuildingExercises;

public class MoveAllZerosUsingTwoPointer {
	public static void main(String[] args) {
		int a[] = { 1, 0, 2, 0, 3, 0 };

		int putnonzerovalue = 0;
		int temp;
		for (int current = 0; current <= a.length - 1; current++) {
			if (a[current] != 0) {
				temp = a[putnonzerovalue];
				a[putnonzerovalue] = a[current];
				a[current] = temp;
				putnonzerovalue++;
			}
		}

		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
