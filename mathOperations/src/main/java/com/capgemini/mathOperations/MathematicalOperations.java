package com.capgemini.mathOperations;

public class MathematicalOperations {
	public static int powerOf(int base, int exponent){
		for(int i = 1 ; i < exponent ; i++){
			base *= base;
		}
		return base;
	}
}
