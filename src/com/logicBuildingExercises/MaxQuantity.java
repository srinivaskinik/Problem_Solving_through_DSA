package com.logicBuildingExercises;

import java.util.HashMap;
import java.util.Map;

public class MaxQuantity {

	public static void main(String[] args) {
		String a[]= {"xyz 9","abc 20","xyz 21"};
		//output get xyz 30 (you need to be adding 9+21
		HashMap<String, Integer> hMap= new HashMap<String, Integer>();
		for(String data: a) {
			String name=data.split(" ")[0];
			int value=Integer.parseInt(data.split(" ")[1]);
			hMap.put(name,hMap.getOrDefault(name, 0)+value);
		}
		int max=0;
		String result="";
		for(Map.Entry<String, Integer> entry:hMap.entrySet()) {
			if(entry.getValue() >max) {
				max=entry.getValue();
				result=entry.getKey();
			}
		}
		System.out.println(max+ " "+result);

	}

}
