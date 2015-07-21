package com.capgemini.mathOperations;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserTest {


	@Rule
	public ExpectedException thrown = ExpectedException.none();

	
	@Test
	public void ShouldThrowNullPointerException() throws NullPointerException{
		thrown.expect(NullPointerException.class);
		User user = new User(new Long(2), null, "hfhs", "fasf");
	}

}
