package com.logicBuildingExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray2 {

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 30, 40 };
		a = Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(a));

	}

}
