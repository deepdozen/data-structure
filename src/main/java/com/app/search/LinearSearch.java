package com.app.search;

public class LinearSearch<E extends Comparable<E>> implements ISearch<E>{

	private E[] array;
	
	LinearSearch(E[] array){
		this.array = array;
	}
	
	public int search(E element) {
		int res = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(element)) {
				res = i;
				break;
			}
		}
		return res;
	}
	
}
