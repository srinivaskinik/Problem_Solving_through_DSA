package com.logicBuildingExercises;

public class CountCharactersInStringWithTwist {
	public static void main(String[] args) {
		String input=" Hie ";
		
		//count the characters in the string which does not have a white space before and after it
		int count =countCharactersInString(input);
		System.out.println(count);
	}

	private static int countCharactersInString(String input) {
		int count=0;
		char[] charArray=input.toCharArray();
		for(int index=0;index<charArray.length;index++) {
			char ch=charArray[index];
			if(ch==' ') {
				continue;
			}
			boolean afterCharState =(index<charArray.length-1) && (charArray[index+1]==' ');
			boolean beforeCharState =(index>0) && (charArray[index-1]==' ');
			
			if(!beforeCharState && !afterCharState) {
				count++;
			}
		}
		
		return count;
		
	}

}
