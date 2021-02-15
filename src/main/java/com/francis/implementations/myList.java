package com.francis.implementations;

import java.util.ArrayList;

import com.francis.interfaces.IList;

public class myList<E> implements IList<E>{

	
	private E[] array = (E[]) new Object[10];
	
	private int size = 0;
	
	//This adds a string to the array as well as doubling in size to have a 10 element space spare
	public void  add(E e)
	{
		array[size] = e;
		size++;
		if (size == array.length)
		{
			Object[] newArray = new Object[array.length * 2];
			for (int i = 0; i < array.length; i++)
			{
				newArray[i] = array[i];
			}
			array = (E[]) newArray;
		}
		
		
	}
	
	// This removes a item by index element number
	public void remove(int index)
	{
		
		for (int i = index; i < size -1; i++)
		{
			array[i] = array[i + 1];
		}
		size--;
	}
	
	
	//This method removes a string if it is matched in the user input
	public void remove(E e)
	{
		int index = -1;
		for(int i = 0; i < size; i++){
		if	(e.equals(array[i]))
		{

		 index = i;
		 break;
		}
		}
	 if (index != -1)
	 {
		 remove(index);
	 }
	}
	
	//This collects the size of the array
	public int getSize()
	{
		return size;
	}
	
	//This methods calls a item in the array by the element index
	public Object get(int index)
	{
		return array[index];
	}

	@Override
	public void insertAtStart(E data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAt(int index, E data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAt(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
