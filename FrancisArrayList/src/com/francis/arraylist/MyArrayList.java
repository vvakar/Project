package com.francis.arraylist;

import java.util.ArrayList;

import java.util.*;

public class MyArrayList {

	
	static Scanner reader = new Scanner(System.in);
	static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		
		//This method accepts input from the user and then adds it to the array named 'array'
		System.out.println("Insert a range of numbers to the array");
		int input = reader.nextInt();
		
		
		//This loop has no limit as how much inputs  a user can input, when a user presses 0 it signifies that they're finished!
		while(input != 0)
		{
			array.add(input);
			input = reader.nextInt();
		}
		
		//This calls the method to print all items in the array
		listArray();
		
      System.out.println("Write the number you would like deleted from the array");
		
      
      //This loop looks for an exact match in the array as to the user input if they are identical the loop will remove the given number and break out of the loop
		int deletion = reader.nextInt();
		for( int i = 0;i < array.size(); i++)
		{
			if(array.get(i) == deletion) 
			{
			array.remove(i);
			
			break;
			}
			
			
		}
		
		listArray();
	
	}

	
		
		//This loop now spits out all the numbers the user has inputed into the array
		public static void listArray() {
		
			for (int i : array)
		{
			System.out.println(i);
		}
		
		}
		
}
		
	
	
	
	
	

