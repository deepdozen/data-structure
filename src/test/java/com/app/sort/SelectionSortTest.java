package com.app.sort;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {
	private SelectionSort<String> sSort;
	private String[] s = {"e","b","a","d","c"};
	private SelectionSort<Integer> iSort;
	private Integer[] i = {5, 5, 6, 2, 3, 1, 4, 7};
	
	@Before
	public void setUp() {
		sSort = new SelectionSort<String>(s);
		iSort = new SelectionSort<Integer>(i);
	}

	@Test
	public void sortTest() {
		String[] expected = {"a","b","c","d","e"};
		Integer[] expectedI = {1, 2, 3, 4, 5, 5, 6, 7};
		sSort.sort();
		System.out.println(Arrays.asList(s));
		assertEquals(expected,s);
		
		iSort.sort();
		System.out.println(Arrays.asList(i));
		assertEquals(expectedI,i);
	}
}
