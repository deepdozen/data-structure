package com.app.tree;

public class BST<V extends Comparable<V>> implements IBST<V>{
	
	class Node{
		
		Node left;
		Node right;
		int height;
		V value;
		
		Node(V value){
			this.value = value;
		}
		
	}
	
	public BST() {};
	
	private Node root;

	public void insert(V value) {
		root = insert(value,root);
	}
	
	private Node insert(V value, Node x) {
		if(x == null) {
			return new Node(value);
		}
		int cmp = value.compareTo(x.value);
		if (cmp>0) {
			x.right = insert(value,x.right);
		}else {
			x.left = insert(value,x.left);
		}
		return x;
	}

	public int height() {
		return 0;
	}

	public void remove(V value) {
		
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node root) {
		if (root == null)
			return ;

		inorder(root.left);
		System.out.print(root.value + " ");
		inorder(root.right);
	}
	
	
}
