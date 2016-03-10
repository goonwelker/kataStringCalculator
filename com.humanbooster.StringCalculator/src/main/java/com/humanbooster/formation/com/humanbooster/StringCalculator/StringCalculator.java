package com.humanbooster.formation.com.humanbooster.StringCalculator;

public class StringCalculator {
	public static int Add(String numbers) {
		String[] splitNumbers = numbers.split(",");
		if (numbers.isEmpty()) {
			return 0;
		} else if (splitNumbers.length > 1) {

			return AddMethod(splitNumbers);
		} else {
			return Integer.parseInt(numbers);
		}

	}

	private static int AddMethod(String[] splitNumbers) {
		int result = 0;
		for (int i = 0; i <= splitNumbers.length - 1; i++) {
			result = result + Integer.parseInt(splitNumbers[i]);
		}
		return result;
	}

}
