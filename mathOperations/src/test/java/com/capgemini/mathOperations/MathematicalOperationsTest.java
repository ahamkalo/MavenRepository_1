package com.capgemini.mathOperations;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathematicalOperationsTest {

	@Test
	public void shouldReturnFour() {
		assertEquals(4, MathematicalOperations.add(2, 2));
	}
	public void shouldReturn1() {
		assertEquals((Integer)1, MathematicalOperations.multiply(1, 1));
	}

	@Test
	public void shouldReturn6() {
		assertEquals((Integer)6, MathematicalOperations.multiply(2, 3));
	}

	@Test
	public void shouldReturnMinus6() {
		assertEquals((Integer)(-6), MathematicalOperations.multiply(2, -3));
	}

	@Test
	public void shouldReturn0() {
		assertEquals((Integer)0, MathematicalOperations.multiply(0, 5));
	}

}
