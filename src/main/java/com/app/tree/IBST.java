package com.app.tree;

public interface IBST<V extends Comparable<V>> {
	void insert(V value);
	int height();
	void remove(V value);
	void inorder();
}
