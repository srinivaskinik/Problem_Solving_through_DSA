package com.logicBuildingExercises;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Apple");//4
		stack.push("Banana");//3
		stack.push("Orange");//2
		stack.push("Mango");//1
		int position = stack.search(("Mango"));
		//if element not present search will return -1
		System.out.println(position);
		System.out.println(stack);
		String topElement = stack.peek();
		System.out.println(topElement);
		String elementOutFromStack= stack.pop();
		System.out.println(elementOutFromStack);
		 topElement = stack.peek();
		System.out.println(topElement);
		System.out.println(stack.isEmpty());
	}

}
