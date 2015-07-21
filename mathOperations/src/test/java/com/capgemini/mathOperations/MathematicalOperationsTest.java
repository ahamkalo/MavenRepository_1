package com.capgemini.mathOperations;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MathematicalOperationsTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldReturnFour() {
		assertEquals(4, MathematicalOperations.add(2, 2));
	}

	@Test
	public void shouldReturn1() {
		assertEquals((Integer) 1, MathematicalOperations.multiply(1, 1));
	}

	@Test
	public void shouldReturn6() {
		assertEquals((Integer) 6, MathematicalOperations.multiply(2, 3));
	}

	@Test
	public void shouldReturnMinus6() {
		assertEquals((Integer) (-6), MathematicalOperations.multiply(2, -3));
	}

	@Test
	public void shouldReturn0() {
		assertEquals((Integer) 0, MathematicalOperations.multiply(0, 5));
	}

	@Test
	public void PowerTestShoulfReturn_4_For_2_2() {
		assertEquals(4, MathematicalOperations.powerOf(2, 2));
	}

	@Test
	public void PowerTestShoulfReturn_0_For_0_6() {
		assertEquals(0, MathematicalOperations.powerOf(0, 6));
	}

	@Test
	public void shouldReturn0for6_6() {
		assertTrue((new Double(0)).equals(MathematicalOperations.substract(new Double(6), new Double(6))));
	}



	
	@Test
	public void shouldReturn2For6And3() {
		Assert.assertEquals(new Double(2), MathematicalOperations.divide(new Double(6), new Double(3)));

}
	@Test
	public void shouldThrowIllegalArgumentExceptionFor6And0() throws IllegalArgumentException {
		thrown.expect(IllegalArgumentException.class);
		MathematicalOperations.divide(new Double(6), new Double(0));

		
	}
	
	
}


