package com.humanbooster.formation.com.humanbooster.StringCalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

	@Test
	public void calculationShouldReturnZeroIfStringIsEmpty() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void calculationShouldReturnTheEntryNumberIfItsAlone() {
		assertEquals(1, StringCalculator.add("1"));
		assertEquals(2, StringCalculator.add("2"));
	}

	@Test
	public void calculationShouldReturnTheSumOfTheTwoString() {
		assertEquals(40, StringCalculator.add("25,15"));
		assertEquals(556, StringCalculator.add("555,1"));
		assertEquals(40, StringCalculator.add("25,15"));
	}

}
