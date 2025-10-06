package com.logicBuildingExercises;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=2;
		int first=0;
		int second=1;
		if(n==1) {
			System.out.println(first);
			System.exit(0);
		} else {
		System.out.println(first);
		System.out.println(second);
		}
		
		for(int i=2;i<n;i++) {
			int next;
			next=first+second;
			System.out.println(next);
			first=second;
			second=next;
		}

	}

}
