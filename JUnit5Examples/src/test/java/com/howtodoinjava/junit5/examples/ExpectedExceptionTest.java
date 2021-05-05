package com.howtodoinjava.junit5.examples;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

// Je veux sélectionné le package principale
@SelectPackages("com.howtodoinjava.junit5.examples")
public class ExpectedExceptionTest
{
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	@Test
	void testExpectedException() {
		// 1- assert throw this exception : NumberFormatException
		exceptionRule.expect(NumberFormatException.class);
		exceptionRule.expectMessage("For input string");
		Integer.parseInt("1a");
	}
// source https://www.baeldung.com/junit-assert-exception
	@Test
	void testExpectedExceptionWithSameType() {
		// 2- assert throw this exception : IllegalArgumentException
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("divided by 0");
		Calculator cal = new Calculator();
		cal.division(1,0);
	}

}
