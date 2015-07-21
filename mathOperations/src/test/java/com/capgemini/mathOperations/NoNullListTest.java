package com.capgemini.mathOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NoNullListTest {
	 List<String> strings;
	@Before
	public void setUp() throws Exception {
		  strings  = new ArrayList<String>(Arrays.asList( null, "not null", null, 
		            "leveluplunch", "com", null, "Ala"));
	}

	@Test
	public void shouldRemoveNulls() {
		Collection<String> removeNullFromList = NoNullList.removeNullFromList(strings);
		Assert.assertEquals(4, removeNullFromList.size());
	}


}
