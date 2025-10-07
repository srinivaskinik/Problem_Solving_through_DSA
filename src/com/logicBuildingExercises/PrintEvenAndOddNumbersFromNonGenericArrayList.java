package com.logicBuildingExercises;

import java.util.ArrayList;

public class PrintEvenAndOddNumbersFromNonGenericArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(23);
		al.add("Java");
		al.add(null);
		al.add(24);
		al.add(false);

		for (Object o : al) {
			if (o instanceof Integer) {
				if (((Integer) o).intValue() % 2 == 0) {
					System.out.println("Even value: " + o);
				} else {
					System.out.println("Odd value: " + o);
				}
			}
		}
	}

}
