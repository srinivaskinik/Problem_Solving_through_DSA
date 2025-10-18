package com.logicBuildingExercises;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWordsInString {

	public static void main(String[] args) {
		String input="Hello My Name is Srini Srini";
		String[] words =input.split(" ");
		
		Map<String,Integer> result = new HashMap<String,Integer>();
		for(String word:words) {
			result.put(word,result.getOrDefault(word, 0)+1);
		}
		
		System.out.println(result);
		
		for(Map.Entry<String, Integer> entry:result.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
