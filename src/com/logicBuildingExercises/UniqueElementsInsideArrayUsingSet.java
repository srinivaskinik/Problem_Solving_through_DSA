package com.logicBuildingExercises;

import java.util.HashSet;

public class UniqueElementsInsideArrayUsingSet {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,2};
		HashSet<Integer> duplicates = new HashSet<Integer>();
		HashSet<Integer> seen = new HashSet<Integer>();
		for(int no:a) {
			if(!seen.add(no)) {
				duplicates.add(no);
			}
		}
		seen.removeAll(duplicates);
		System.out.println(seen);
		

	}

}
