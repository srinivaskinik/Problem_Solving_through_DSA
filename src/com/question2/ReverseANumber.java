package com.question2;

public class ReverseANumber {
	public static void main(String[] args) {
		System.out.println(reveseNumber(247483649));
	}

	public static int reveseNumber(int number) {
		int reverseNo = 0;
		int lastDigit;
		while (number != 0) {
			lastDigit = number % 10;
			if (reverseNo > Integer.MAX_VALUE / 10 || (reverseNo == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
				return 0;
			}
			if (reverseNo < Integer.MIN_VALUE / 10 || (reverseNo == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
				return 0;
			}
			reverseNo = reverseNo * 10 + lastDigit;
			number = number / 10;
		}
		return reverseNo;
	}

}
