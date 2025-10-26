package com.logicBuildingExercises;

import java.util.Arrays;

public class MaxProductOfTriplets_Solution1 {
	public static void main(String[] args) {
		int a[] = {-10,-3,5,6,-20};
		int n =a.length;
		if(n<3) {
			System.out.println("Min length required to calculate product triplet is 3");
			System.exit(0);
		}
		
		Arrays.sort(a);
		int resultOne=a[0]*a[1]*a[n-1];
		int resultTwo=a[n-1] * a[n-2] *a[n-3];
		
		int result = Math.max(resultOne, resultTwo);
		
		System.out.println(result);
		
		
	}

}
