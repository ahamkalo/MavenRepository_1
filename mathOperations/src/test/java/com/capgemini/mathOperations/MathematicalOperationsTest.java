package com.capgemini.mathOperations;


import org.junit.Assert;
import org.junit.Test;

public class MathematicalOperationsTest {

	@Test
	public void PowerTestShoulfReturn_4_For_2_2() {
		Assert.assertEquals(4, MathematicalOperations.powerOf(2, 2));
	}
	
	@Test
	public void PowerTestShoulfReturn_0_For_0_6() {
		Assert.assertEquals(0, MathematicalOperations.powerOf(0, 6));
	}

}
