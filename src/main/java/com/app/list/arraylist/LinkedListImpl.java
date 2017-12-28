package com.app.list.arraylist;

import java.util.Iterator;

import com.app.list.List;
import com.app.list.Node;

public class LinkedListImpl<V> implements List<V> {

	private int size;
	private Node<V> root;
	
	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void add(V item) {
		if (root == null)
			root = new Node<V>(item);
		else {
			Node<V> tmp = root;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			Node<V> node = new Node<V>(item);
			tmp.setNext(node);
			node.setPrev(tmp);
		}
		size++;
	}

	public V get(int index) {
		Node<V> tmp = root;
		int cnt = 0;
		while(tmp.getNext() != null) {
			if(index == cnt) break;
			tmp = tmp.getNext();
			cnt++;
		}
		
		return tmp.getValue();
	}

	public V set(int index, V value) {
		Node<V> tmp = root;
		int cnt = 0;
		while(tmp.getNext() != null) {
			if(index == cnt) break;
			tmp = tmp.getNext();
			cnt++;
		}
		V res = tmp.getValue();
		tmp.setValue(value);
		return res;
	}
	//
	public V remove(int index) {
		Node<V> tmp = root;
		int cnt = 0;
		while(tmp.getNext() != null) {
			if(index == cnt) break;
			tmp = tmp.getNext();
			cnt++;
		}
		Node<V> prev = tmp.getPrev();
		if(prev != null)
			prev.setNext(tmp.getNext());
		
		Node<V> next = tmp.getNext();
		if(next != null)
			next.setPrev(tmp.getPrev());
		
		return tmp.getValue();
	}

	public Iterator<V> iterator() {
		return new Iterator<V>() {

			int itrIndx;
			
			public boolean hasNext() {
				return size>itrIndx;
			}

			public V next() {
				Node<V> tmp = root;
				int cnt = 0;
				while(tmp.getNext()!=null) {
					if(itrIndx == cnt) break;
					tmp = tmp.getNext();
					cnt++;
				}
				itrIndx++;
				return tmp.getValue();
			}
			
		};
	}

}
