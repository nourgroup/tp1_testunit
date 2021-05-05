package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatedInvocationsTest {
	
	// 1- create double method to show message before all and before each
	@Test
	@BeforeAll
	@BeforeEach
	private static String message () {
		return "show message before all and before each";
	}
	// 2- test title
	@DisplayName("Repeated Invocations Test")
	// 3- repeat it 5 times
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo)
	{
		System.out.println("Running addNumber test -> " + repetitionInfo.getCurrentRepetition());
		// 4- create test with assertEquals
		Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
	}
	

	// 5- double clean method after all and after each


}