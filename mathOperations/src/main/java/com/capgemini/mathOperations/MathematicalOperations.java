package com.capgemini.mathOperations;

public class MathematicalOperations {
	
	public static Double divide(Double number1, Double number2) throws IllegalArgumentException{
		if(number2==0){
			throw new IllegalArgumentException("Do not divide by 0");
		}
		return number1/number2;
	}
}
