package com.app.bag;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

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
	
	@Test
	public void testIterator() throws Exception {
		Bag<Integer> bag = new BagImpl<Integer>(Integer.class,5);
		assertTrue(bag.size()==0);
		bag.add(1);
		bag.add(2);
		bag.add(4);
		bag.add(25);
		bag.add(5);
		
		Iterator<Integer> iterator = bag.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}

