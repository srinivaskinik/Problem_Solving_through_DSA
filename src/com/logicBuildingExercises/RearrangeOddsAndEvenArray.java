package com.logicBuildingExercises;

import java.util.Arrays;

public class RearrangeOddsAndEvenArray {

	public static void main(String[] args) {
		//all the even nos need to come first and sorted
		//all the odd nos should come in the end and sorted
		
		int a[]= {1,0,2,0,4,3,5};
		int left=0;
		int right=a.length-1;
		System.out.println("Original Array "+Arrays.toString(a));
		while(left<right) {
			while(left<right && a[left] %2==0) {
				left++;
			}
			
			while(left<right && a[right] %2!=0) {
				right--;
			}
			if(left<right) {
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
			System.out.println(Arrays.toString(a));
		}
		int evenEnd=0;//to know where does even end
		while(evenEnd<a.length && a[evenEnd]%2==0) {
			evenEnd++;
		}
		System.out.println(evenEnd);
		
		Arrays.sort(a, 0, evenEnd);
		Arrays.sort(a, evenEnd, a.length);
		
		System.out.println("Result "+Arrays.toString(a));

	}

}
