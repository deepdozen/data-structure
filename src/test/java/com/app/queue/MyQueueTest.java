package com.app.queue;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class MyQueueTest {
	private MyQueue<String> myQueue;
	
	public MyQueueTest() {
		myQueue = new MyQueueImpl<String>(String.class);
		
	}
	
	@Test
	public void size() {
		assertTrue(myQueue.size()==0);
		myQueue.enqueue("a");
		assertTrue(myQueue.size()==1);
		myQueue.enqueue("a");
		assertTrue(myQueue.size()==2);
	}
	
	@Test
	public void isEmpty() {
		assertTrue(myQueue.isEmpty());
		myQueue.enqueue("a");
		assertFalse(myQueue.isEmpty());
	}
	
	@Test
	public void enqueue() {
		myQueue.enqueue("a");
		myQueue.enqueue("b");
		myQueue.enqueue("c");
		assertTrue(myQueue.size()==3);
	}
	
	@Test(expected=RuntimeException.class)
	public void dequeue() {
		myQueue.enqueue("a");
		myQueue.enqueue("b");
		myQueue.enqueue("c");
		assertTrue(myQueue.size()==3);
		Object oldValue = myQueue.dequeue();
		assertTrue(myQueue.size()==2);
		assertEquals(oldValue, "a");
		oldValue = myQueue.dequeue();
		assertTrue(myQueue.size()==1);
		assertEquals(oldValue, "b");
		oldValue = myQueue.dequeue();
		assertTrue(myQueue.size()==0);
		assertEquals(oldValue, "c");
		oldValue = myQueue.dequeue();		
		
	}
	
	@Test
	public void iteratorTest() {
		myQueue.enqueue("a");
		myQueue.enqueue("b");
		myQueue.enqueue("c");
		Iterator<String> itr = myQueue.iterator();
		while(itr.hasNext()) {
			Object value = itr.next();
			System.out.println(value);
		}
	}
}
