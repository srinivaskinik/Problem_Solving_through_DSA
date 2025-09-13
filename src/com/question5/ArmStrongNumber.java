package com.question5;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// 153 is a armstrong number = sum of cubes of individual digits = 1 cube + 5
		// cube + 3 cube
		System.out.println(checkArmstrong(123));
	}

	public static boolean checkArmstrong(int number) {
		int lastDigit;
		int armstrongNumber = 0;
		int copy = number;

		while (copy != 0) {
			lastDigit = copy % 10;
			copy = copy / 10;
			armstrongNumber = armstrongNumber + (lastDigit * lastDigit * lastDigit);
		}
		if (armstrongNumber == number) {
			return true;
		} else {
			return false;
		}
	}

}
