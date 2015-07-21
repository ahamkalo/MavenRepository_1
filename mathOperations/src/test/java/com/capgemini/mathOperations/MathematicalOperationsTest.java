package com.capgemini.mathOperations;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MathematicalOperationsTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

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

