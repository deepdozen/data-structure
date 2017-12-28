package com.app.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	private Stack<String> stack;
	
	@Before
	public void setUp() {
		stack = new StackImpl2<String>();
	}

	@Test
	public void pushTest() {
		assertTrue(stack.isEmpty());
		stack.push("a");
		assertFalse(stack.isEmpty());
		assertTrue(stack.size() == 1);
		stack.push("b");
		assertTrue(stack.size() == 2);
	}

	@Test
	public void sizeTest() {
		assertTrue(stack.isEmpty());
		stack.push("a");
		stack.push("b");
		assertFalse(stack.isEmpty());
		assertTrue(stack.size() == 2);
	}
	
	@Test
	public void peekTest() {
		assertTrue(stack.isEmpty());
		stack.push("a");
		stack.push("b");
		stack.peek();
		assertTrue(stack.size() == 2);
	}
	
	@Test
	public void popTest() {
		assertTrue(stack.isEmpty());
		stack.push("a");
		stack.push("b");
		assertTrue(stack.size() == 2);
		Object obj = stack.pop();
		assertTrue(stack.size() == 1);
		assertEquals(obj, "b");
	}
}
