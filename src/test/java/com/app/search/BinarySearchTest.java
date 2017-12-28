package com.app.search;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	private BinarySearch<String> lSearch;
	
	@Before
	public void setUp() {
		String[] a = {"a","b","c","d","e"};
		lSearch = new BinarySearch<String>(a);
	}
	
	@Test
	public void searchTest() {
		assertEquals(1,lSearch.search("b"));
		assertEquals(2,lSearch.search("c"));
		assertEquals(4,lSearch.search("e"));
		assertEquals(3,lSearch.search("d"));
		assertEquals(-1,lSearch.search("fa"));
		
	}
}
