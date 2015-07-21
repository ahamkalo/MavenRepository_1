package com.capgemini.mathOperations;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathematicalOperationsTest {

	@Test
	public void shouldReturnFour() {
		assertEquals(4, MathematicalOperations.add(2, 2));
	}

}
