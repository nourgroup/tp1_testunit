package com.howtodoinjava.junit5.examples;

public class Calculator {
	
	public Calculator() {}

	public static int add(int i, int j) {
		return i + j;
	}

	public static Double division(int i, int j) {
		if(j==0)
			throw new IllegalArgumentException(Integer.toString(j));
		return Double.valueOf(i / j);
	}

}
