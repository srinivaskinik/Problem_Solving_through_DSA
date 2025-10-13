package com.logicBuildingExercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		int a[] = {10,10,20,30,40};
		Set<Integer> dataset=new LinkedHashSet<Integer>();
		for(int data:a) {
			dataset.add(data);
		}
		
		System.out.println(dataset);
		//convert back to array using Streams
		int result[]= dataset.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(result));

	}

}
