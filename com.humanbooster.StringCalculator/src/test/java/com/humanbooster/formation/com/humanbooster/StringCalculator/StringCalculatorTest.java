package com.humanbooster.formation.com.humanbooster.StringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StringCalculatorTest {

	//test un param vide
	@Test
	public void Add_EmptyStringAsParam_ReturnZero() {
		int resultEmpty = StringCalculator.Add("");
		assertEquals(0, resultEmpty);
	}

	//test param un nombre
	@Test
	public void Add_OneNumberAsParam_ReturnNumber() {
		int resultOneNumber = StringCalculator.Add("1");
		assertEquals(1, resultOneNumber);
	}
	
	@Test
	public void Add_TwoNumbersAsParam_ReturnAdditionNumbers() {
		int resultAdditionNumbers = StringCalculator.Add("1,2");
		assertEquals(3, resultAdditionNumbers);
	}
	
	

}
