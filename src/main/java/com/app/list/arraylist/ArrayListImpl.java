package com.app.list.arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

import com.app.list.List;

public class ArrayListImpl<V> implements List<V>{
	
	private V[] data;
	private int capacity;
	private int size;
	private long version;
	
	public ArrayListImpl(Class<V> c) {
		this(c,10);
	}

	public ArrayListImpl(Class<V> c, int capacity) {
		this.data =  (V[])Array.newInstance(c, capacity);
		this.capacity = capacity;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size() {
		return this.size;
	}

	public void add(V item) {
		version++;
		if(size > data.length) {
			data = Arrays.copyOf(data, data.length + capacity);
		}
		data[size] = item;
		size++;
	}

	public V get(int index) {
		return data[index];
	}

	public V set(int index, V value) {
		V res = this.data[index];
		data[index] = value;
		return res;
	}

	public V remove(int index) {
		version++;
		V res = this.data[index];
		for (int i = index; i < data.length-1; i++) {
			data[i] = data[i+1];
		}
		data[size--]=null;
		return res;
	}

	public Iterator<V> iterator() {
		return new Iterator<V>() {
			int itrIndx;
			long itrVersion = version;
			
			public boolean hasNext() {
				return size > itrIndx;
			}

			public V next() {
				if(itrVersion!=version) {
					throw new ConcurrentModificationException();
				}
				return data[itrIndx++];
			}
			
		};
	}

}
