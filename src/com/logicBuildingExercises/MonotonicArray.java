package com.logicBuildingExercises;

public class MonotonicArray {

	public static void main(String[] args) {
		int array[]= {1,3,3,4};
		System.out.println("Given array is monotonic "+checkMonotonic(array));

	}

	private static boolean checkMonotonic(int [] array) {
		boolean increasing=true;
		boolean decreasing=true;
		for(int i=1;i<array.length;i++) {
			if(array[i-1]<array[i]) {
				decreasing=false;
			} else if(array[i-1]>array[i]) {
				increasing=false;
			}
		}
		
		return decreasing ||increasing;
		
	}

}
