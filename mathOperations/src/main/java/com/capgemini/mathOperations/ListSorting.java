package com.capgemini.mathOperations;

import java.util.List;

public class ListSorting {
	public static List<Integer> sort(List<Integer> list, int k) {
		return com.google.common.collect.Ordering.natural().greatestOf(list, k);
	}
}
