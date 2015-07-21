package com.capgemini.mathOperations;

import com.google.common.math.IntMath;

public class Multiply {
    public static boolean isNotOverflow(int firstNumber, int secondNumber)
    {
    	try{
        	IntMath.checkedMultiply(firstNumber,secondNumber);
        }catch(ArithmeticException e){
        	return false;
        }
    	return true;
    }

}
