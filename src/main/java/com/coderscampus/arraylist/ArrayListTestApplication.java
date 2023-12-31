package com.coderscampus.arraylist;

public class ArrayListTestApplication {

	public static void main(String[] args) {

		CustomList<Integer> myCustomList = new CustomArrayList<>();

		
		// Chose the max number of items to be added to the list below :
		
		Integer myCustomListSize = 40;
		
		for (Integer i = 1; i <= myCustomListSize; i++) {
			myCustomList.add(i);
		}
		
		myCustomList.add(41);
		myCustomList.add(42);
		myCustomList.add(43);
		
		
		// test the size :

		System.out.println("CustomArrayList size is -> " + myCustomList.getSize());

		System.out.println("- - - - -");
		
		// print all :

		for (Integer i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index " + i + " -> " + myCustomList.get(i));
		}

	}

}
