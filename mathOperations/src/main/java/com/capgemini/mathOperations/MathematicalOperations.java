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
}
