package com.logicBuildingExercises;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

	public static void main(String[] args) {
		String input="programming";
		LinkedHashMap<Character, Integer> hmap= new LinkedHashMap<Character, Integer>();
		
		for(char c:input.toCharArray()) {
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:hmap.entrySet()) {
			if(entry.getValue() ==1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
