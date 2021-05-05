package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AfterAnnotationsTest {

	// 1- test title
	@DisplayName("After Annotations Test")
	// 2- repeat test 5 times
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo)
	{
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	// 3-do it after all
	@Test
	@AfterAll
	public static void cleanUp(){
		System.out.println("After All cleanUp() method called");
	}
	
	// 4-do it after each
	@Test
	@AfterEach
	public void cleanUpEach(){
		System.out.println("After Each cleanUpEach() method called");
	}

}
