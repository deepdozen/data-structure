package com.app.list.arraylist;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import com.app.list.List;

public class ArrayListTest {

	private List<String> list;
	
	@Before
	public void setUp() {
		list = new ArrayListImpl(String.class);
		//list = new LinkedListImpl();
		//Iterator itr = list
	}
	
	@Test
	public void addTest() {
		assertTrue(list.isEmpty());
		list.add("1");
		list.add("2");
		assertTrue(list.size()==2);
	}

	@Test
	public void getTest() {
		assertTrue(list.isEmpty());
		list.add("1");
		list.add("2");
		assertEquals(list.get(1),"2");
	}
	
	@Test
	public void removeTest() {
		assertTrue(list.isEmpty());
		list.add("1");
		list.add("2");
		assertEquals(list.remove(0),"1");
	}
	
	@Test
	public void setTest() {
		assertTrue(list.isEmpty());
		list.add("1");
		list.add("2");
		assertEquals(list.set(0,"a"),"1");
		assertEquals(list.get(0),"a");
	}
	
	@Test
	public void sizeTest() {
		assertTrue(list.isEmpty());
		list.add("1");
		list.add("2");
		assertEquals(list.size(),2);
	}
}
