package com.francis.interfaces;

/**
* Documentation: This is a simplified List implementation with only basic functionality.
*/


public interface IList<E> {
	
	
	
	// Adds an generic element into the array
	public void  add(E e);
	
	// Removes a generic element from the array using index number
	public void remove(int index);
	
	// Removes a generic element from the array
	public void remove(E e);
	
	// Retrieves the size of the array
	public int getSize();
	
	
	// Retrieves a generic element from the array using index number
	public Object get(int index);
	
 
	
	//This methods inserts a data element at the start of the linked-list
	public void insertAtStart(E data);
	
	//This methods allows for a data element to be inserted in any given position of the array
	public void insertAt(int index,E data);
	//This methods allows for removing data from a specific index in the array
	public void deleteAt(int index);
	
	//This methods display the elements within the array
	public void show();
	
	
	
	
	

}


