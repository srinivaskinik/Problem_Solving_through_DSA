package com.logicBuildingExercises;

public class ConsecutiveNumbersWithTarget {

	public static void main(String[] args) {
		int arr[]= {7,5,1,4,5,8,2};
		//output should be consecutive sum of array should be 10
		//4,5,1 and 8,2
		int target=10;
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum>target) {
					break;
				}
				if(sum ==target) {
					for(int k=i;k<=j;k++) {
						System.out.print(arr[k]+" ");
					}
					System.out.println(" ");
				}
			}//find the ending point
		}

	}

}
