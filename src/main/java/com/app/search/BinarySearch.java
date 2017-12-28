package com.app.search;

public class BinarySearch<E extends Comparable<E>> implements ISearch<E>{

	private E[] array;
	
	BinarySearch(E[] array){
		this.array = array;
	}
	
	public int search(E element) {
		return search(element, array, 0, array.length - 1);
	}

	public int search(E element, E[] a, int low, int high) {
		if (high >= 1 && low <= high) {
			int half = low + (high - low) / 2;

			if (a[half].equals(element))
				return half;

			int cmp = element.compareTo(a[half]);

			if (cmp > 0)
				return search(element, a, half + 1, high);
			else
				return search(element, a, low, half - 1);
		}
		return -1;
	}

}
