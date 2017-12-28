package com.app.search;

public interface ISearch<E extends Comparable<E>> {
	int search(E element);
}
