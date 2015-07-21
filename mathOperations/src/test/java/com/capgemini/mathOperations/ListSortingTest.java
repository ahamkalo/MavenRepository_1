package com.capgemini.mathOperations;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListSortingTest {

	@Test
	public void shouldReturn5() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(1);
		List<Integer> list_2 = ListSorting.sort(list, 1);
		assertEquals(5, list_2.get(0).intValue());
	}

}
