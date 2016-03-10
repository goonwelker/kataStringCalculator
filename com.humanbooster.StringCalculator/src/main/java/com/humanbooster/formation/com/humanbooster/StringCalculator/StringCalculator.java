package com.humanbooster.formation.com.humanbooster.StringCalculator;

public class StringCalculator {
	public static int Add(String numbers) {
		String[] splitNumbers = numbers.split(",");
		if (numbers.isEmpty()) {
			return 0;
		} else if (splitNumbers.length == 2) {
			return Integer.parseInt(splitNumbers[0]) + Integer.parseInt(splitNumbers[1]);
		} else {
			return Integer.parseInt(numbers);
		}

	}

}
