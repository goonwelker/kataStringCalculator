package com.humanbooster.formation.com.humanbooster.StringCalculator;

public class StringCalculator {

	/**
	 * Add numbers from the string, and returns the sum.
	 */
	public static int add(String string) {

		if (string.equals("")) {
			return 0;

		} else {

			String[] numbers = string.split(",");

			if (numbers.length == 1) {
				int convertedStringToInt = Integer.parseInt(numbers[0]);
				return convertedStringToInt;
			}

			if (numbers.length == 2) {
				int firstNumber = Integer.parseInt(numbers[0]);
				int secondNumber = Integer.parseInt(numbers[1]);
				return firstNumber + secondNumber;
			}
			return 1000;
		}
	}
}
