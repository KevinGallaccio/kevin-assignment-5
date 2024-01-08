package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	Integer arraySize = 0;

	@Override
	public boolean add(T item) {
		if (arraySize == items.length) {
			Object[] itemsUpdated = Arrays.copyOf(items, getSize() * 2);
			items = itemsUpdated;
		}
		items[arraySize] = item;
		arraySize++;
		return true;
	}
	

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
