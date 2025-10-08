package com.logicBuildingExercises;

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][]= new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		if(a==null || a.length==0 ||a[0].length==0) {
			System.out.println("Transponse is not possible");
		} else {
			for(int row=0;row<a.length;row++) {
				for(int col=0;col<a[0].length;col++) {
					System.out.print(a[row][col]+" ");
				}
				System.out.println();
			}
			
			int result[][]=new int[3][2];
			
			for(int row=0;row<a.length;row++) {
				for(int col=0;col<a[0].length;col++) {
					result[col][row]=a[row][col];
				}
			}
			
			for(int row=0;row<result.length;row++) {
				for(int col=0;col<result[0].length;col++) {
					System.out.print(result[row][col]+" ");
				}
				System.out.println();
			}
		}
		
		

	}

}
