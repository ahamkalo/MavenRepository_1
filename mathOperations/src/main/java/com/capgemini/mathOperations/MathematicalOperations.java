package com.capgemini.mathOperations;

public class MathematicalOperations {


	public static int add(int a, int b) {
		return a + b;
	}

	public static Integer multiply(int firstNumber, int secondNumber) {
		try {
			if (Multiply.isNotOverflow(firstNumber, secondNumber)) {
				return firstNumber * secondNumber;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			return null;
		}
	}

	public static int powerOf(int base, int exponent) {
		for (int i = 1; i < exponent; i++) {
			base *= base;
		}
		return base;
	}

	public static Double substract(Double num1, Double num2) {
		return num1 - num2;
	}


	
	public static Double divide(Double number1, Double number2) throws IllegalArgumentException{
		if(number2==0){
			throw new IllegalArgumentException("Do not divide by 0");
		}
		return number1/number2;
	}

}
