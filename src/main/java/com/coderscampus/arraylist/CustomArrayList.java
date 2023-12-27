package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	Integer arraySize = 0;

	@Override
	public boolean add(T item) {
		if (arraySize == items.length || arraySize % 10 == 0) {
			if (arraySize % 10 == 0) {
			Object[] itemsUpdated = Arrays.copyOf(items, getSize() + 10);
			items = itemsUpdated;
		} 
		items[arraySize] = item;
		arraySize++;
		return true;
		} else {
			return false;
		}
	}
	
	// the simplified version below works but I wanted to check and return a false statement if the array is full :
	
//	@Override
//	public boolean add(T item) {
//			if (arraySize % 10 == 0) {
//			Object[] itemsUpdated = Arrays.copyOf(items, getSize() + 10);
//			items = itemsUpdated;
//		} 
//		items[arraySize] = item;
//		arraySize++;
//		return true;
//	}

	
	@Override
	public int getSize() {
		return arraySize;
	}

	
	@Override
	public T get(int index) {
		if (index >= 0 && index < arraySize) {
			@SuppressWarnings("unchecked")
			T item = (T) items[index];
			return item;
		} else {
			System.out.println("index is out of bounds");
		}
		return null;
	}

}
