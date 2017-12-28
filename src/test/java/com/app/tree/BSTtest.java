package com.app.tree;


import org.junit.Before;
import org.junit.Test;

public class BSTtest {

	private IBST<Integer> bst;
	
	@Before
	public void setUp() {
		bst = new BST<Integer>();
	}
	
	@Test
	public void insertTest() {
		bst.insert(4);
		bst.insert(3);
		bst.insert(5);
		bst.insert(1);
		bst.insert(2);
		bst.insert(6);
		bst.insert(7);
		bst.inorder();
	}
	
}
