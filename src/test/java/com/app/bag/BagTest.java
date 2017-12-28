package com.app.bag;

import static org.junit.Assert.*;

import org.junit.Test;

public class BagTest {
	
	
	@Test
	public void size() {
		Bag<String> bag = new BagImpl<String>(String.class);
		assertTrue(bag.size()==0);
		bag.add("a");
		bag.add("b");
		assertTrue(bag.size()==2);
		bag.add("a");
		assertTrue(bag.size()==3);
	}
	
	@Test
	public void isEmpty() {
		Bag<String> bag = new BagImpl<String>(String.class);
		assertTrue(bag.isEmpty());
		bag.add("a");
		assertFalse(bag.isEmpty());
	}
	
	@Test
	public void add() {
		Bag<String> bag = new BagImpl<String>(String.class);
		assertTrue(bag.size()==0);
		bag.add("a");
		assertTrue(bag.size()==1);
	}
	
}

