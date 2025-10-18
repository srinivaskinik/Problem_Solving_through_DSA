package com.logicBuildingExercises;

import java.util.ArrayList;

public class FindCommonElementsFromList {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("One");
		list1.add("How");
		list1.add("Ten");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Two");
		list2.add("Ten");
		list2.add("How");
		
		list1.retainAll(list2);
		
		System.out.println(list1);
	}

}
