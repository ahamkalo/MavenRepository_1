package com.capgemini.mathOperations;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void shoudReturnIsOverflow() {
		assertFalse(Multiply.isNotOverflow(100000, 100000));
	}

	@Test
	public void shoudReturnIsNotOverflow() {
		assertTrue(Multiply.isNotOverflow(100, 100));
	}

}
