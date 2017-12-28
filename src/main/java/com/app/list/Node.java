package com.app.list;

public class Node<V> {
		private V value;
		private Node<V> next;
		private Node<V> prev;
		
		public Node(V value) {
			this.value = value;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
		public Node<V> getNext() {
			return next;
		}
		public void setNext(Node<V> next) {
			this.next = next;
		}
		public Node<V> getPrev() {
			return prev;
		}
		public void setPrev(Node<V> prev) {
			this.prev = prev;
		}
		
}
