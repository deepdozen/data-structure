package com.app.stack;

import java.lang.reflect.Array;
import java.util.Iterator;

public class StackImpl<V> implements Stack<V> {
	
	private V[] data;
	private int capacity;
	private int size;
	Class<V> clazz;
	
	public StackImpl(Class<V> c) {
		this(c, 10);
	}

	public StackImpl(Class<V> c, int capacity) {
		this.capacity = capacity;
		this.data = (V[])Array.newInstance(c, capacity);
		this.clazz = c;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public V pop() {
		V value = data[size-1];
		data[size-1] = null;
		size--;
		return value;
	}

	public V peek() {
		return data[size-1];
	}

	public void push(V item) {
		if(size > data.length) {
			V[] tmp =  (V[])Array.newInstance(clazz, data.length + capacity);
			System.arraycopy(data, 0, tmp, 0, data.length);
		}
		data[this.size] = item;
		size++;
	}

	public Iterator<V> iterator() {
		return new Iterator<V>() {
			int itrIndex;
			public boolean hasNext() {
				return size>itrIndex;
			}

			public V next() {
				return data[size - 1 - itrIndex++];
			}
			
		};
	}
	
}
