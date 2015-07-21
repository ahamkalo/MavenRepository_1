package com.capgemini.mathOperations;

import org.junit.Assert;
import org.junit.Test;



public class MathematicalOperationsTest {


	@Test
	public void shouldReturn0for6_6() {
		Assert.assertTrue((new Double(0)).equals( MathematicalOperations.substract(new Double(6),new Double(6))));
	}

}
