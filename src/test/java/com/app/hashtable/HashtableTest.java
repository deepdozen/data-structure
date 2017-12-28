package com.app.hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
	
	IHashtable<Integer, String> tab;

	@Before
	public void setUp(){
		tab = new HashTableImpl();
	}
	
	@Test
	public void putTest() {
		assertEquals(0, tab.size());
		assertTrue(tab.isEmpty());
		tab.put(1, "one");
		tab.put(2, "two");
		tab.put(3, "three");
		assertEquals(3, tab.size());
		assertFalse(tab.isEmpty());
	}

	@Test
	public void getTest() {
		assertEquals(0, tab.size());
		assertTrue(tab.isEmpty());
		tab.put(1, "one");
		tab.put(2, "two");
		tab.put(3, "three");
		assertEquals(3, tab.size());
		assertFalse(tab.isEmpty());
		assertEquals("two", tab.get(2));
	}
	
	@Test
	public void removeTest() {
		assertEquals(0, tab.size());
		assertTrue(tab.isEmpty());
		tab.put(1, "one");
		tab.put(2, "two");
		tab.put(3, "three");
		assertEquals(3, tab.size());
		assertFalse(tab.isEmpty());
		assertEquals("two", tab.remove(2));
		assertEquals(2, tab.size());
	}
}
