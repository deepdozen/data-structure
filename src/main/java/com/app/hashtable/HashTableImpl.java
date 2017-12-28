package com.app.hashtable;

import java.util.Objects;

public class HashTableImpl<K,V> implements IHashtable<K,V>{
	
	private final int INIT_SIZE = 128;
	private Node<K,V> [] table = new HashTableImpl.Node[INIT_SIZE];
	private int size;
	class Node<K,V>{
		K key;
		V value;
		Node<K,V> next;
		
		Node(K key, V value){
			this.key = key;
			this.value = value;
		}		
		
	}
	
	public void put(K key, V value) {
		int hash = Objects.hash(key) % INIT_SIZE;
		Node<K,V> node = new Node(key, value);
		if(table[hash]==null) {
			table[hash] = node;
		}else {
			while(table[hash]!=null) {
				table[hash] = table[hash].next;
			}
			table[hash] = node;
		}
		size++;
	}

	public V get(K key) {
		int hash = Objects.hash(key) % INIT_SIZE;
		V value = null;
		Node<K,V> node = table[hash];
		while(node!=null) {
			if(node.key.equals(key)) {
				value = node.value;
				break;
			}
			else
				node = node.next;
		}
		return value;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public V remove(Object key) {
		int hash = Objects.hash(key) % INIT_SIZE;
		Node<K,V> node = table[hash];
		Node<K,V> prev = node;
		V value = null;
		if(node!=null) {
			while(node!=null) {
				if(node.key.equals(key)) {
					value = node.value;
					Node<K,V> next = node.next;
					prev.next = next;
					break;
				}else {
					prev = node;
					node = node.next;
				}
			}
			size--;
		}
		return value;
	}

}
