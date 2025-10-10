package com.logicBuildingExercises;

import java.util.HashMap;
import java.util.Map;

public class ReverseAMap {
	public static void main(String[] args) {
		Map<String,Integer> ogMap=new HashMap<String,Integer>();
		ogMap.put("A", 1);
		ogMap.put("B", 2);
		ogMap.put("C", 3);
		ogMap.put("D", 4);
		System.out.println(ogMap);
		Map<Integer,String> resultMap=new HashMap<Integer,String>();
		
		for(Map.Entry<String, Integer> data: ogMap.entrySet()) {
			resultMap.put(data.getValue(), data.getKey());
		}
		System.out.println(resultMap);
		
	}

}
