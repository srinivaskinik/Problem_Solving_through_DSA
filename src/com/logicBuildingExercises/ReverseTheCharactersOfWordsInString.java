package com.logicBuildingExercises;

public class ReverseTheCharactersOfWordsInString {

	public static void main(String[] args) {
		String input="This is fun";
		String result="";
		String[] words = input.split(" ");
		for(String word:words) {
			char[] chArray=word.toCharArray();
			int left=0;
			int right=chArray.length-1;
			char temp;
			while(left<right) {
				temp=chArray[left];
				chArray[left]=chArray[right];
				chArray[right]=temp;
				left++;
				right--;
			}
			result= result +new String(chArray)+" ";
		}
		
		System.out.println(result.trim());

	}

}
