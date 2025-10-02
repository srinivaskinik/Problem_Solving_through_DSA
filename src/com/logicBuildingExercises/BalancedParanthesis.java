package com.logicBuildingExercises;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// leetcode 20

		String input = "((";
		System.out.println("Balanced paranthesis in the given string "+input+ ": "+isValid(input));

	}

	public static boolean isValid(String input) {
		char[] charArray = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char current : charArray) {
			if (current == '(') {
				stack.push(current);
			} else {
				if (current == ')') {
					if (stack.isEmpty()) {
						return false; //mismatch occurred. No opening backet present
					} else {
						char pop = stack.pop();
						if (pop != '(') {
							return false;
						}
					}
				}
			}

		}
		return stack.isEmpty();
	}

}
