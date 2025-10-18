package com.logicBuildingExercises;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementsFromList2 {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("One");
		list1.add("How");
		list1.add("Ten");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Two");
		list2.add("Ten");
		list2.add("How");
		
		//Using lambda expression
		//Set<String> result = list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toSet());
		//System.out.println(result);
		
		//using stream
		Set<String> result = list1.stream().filter(list2::contains).collect(Collectors.toSet());
		System.out.println(result);
	}

}
