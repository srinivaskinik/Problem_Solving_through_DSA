package com.logicBuildingExercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementsFromList3 {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("One");
		list1.add("How");
		list1.add("Ten");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Two");
		list2.add("Ten");
		list2.add("How");
		
		Set<String> result = new HashSet<String>();
		
		for(int i=0;i<list1.size();i++) {
			for(int j=0;j<list2.size();j++) {
				if(list1.get(i).equalsIgnoreCase(list2.get(j))) {
					result.add(list1.get(i));
				}
			}
		}
		System.out.println(result);
	}

}
