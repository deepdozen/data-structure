package com.app.search;

import static org.junit.Assert.*;
import org.junit.*;

public class LinearSearchTest {

	private LinearSearch<String> lSearch;
	
	@Before
	public void setUp() {
		String[] a = {"a","b","c","d","e"};
		lSearch = new LinearSearch<String>(a);
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
