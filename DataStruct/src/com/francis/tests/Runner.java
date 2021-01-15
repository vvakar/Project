package com.francis.tests;

import com.francis.implementations.myList;

import com.francis.interfaces.IList;

public class Runner {
	//String generic 
	
	public static void Main(String[] args) {
			IList<String> customer = new myList<String>();
			
			//Integer generic
			IList<Integer> customer2 = new myList<Integer>();
			
			customer.add("John");
			customer.add("Michael");
			customer.add("Junior");
			customer.add("Stephen");
			
			
			
			//INTEGER IMPL
			
			//This loops spits out everything in the array
			for(int i = 0; i < customer.getSize(); i++)
			{
				System.out.println(customer.get(i));
			}
			
			System.out.println();
			
			customer.remove(2);
			customer.remove("Stephen");
			
			//This loops spits out everything in the array after the two additional method calls
			for(int i = 0; i < customer.getSize(); i++)
			{
				System.out.println(customer.get(i));
			}
			
			
			//STRING IMPL
			
			customer2.add(34);
			customer2.add(3);
			customer2.add(9);
			customer2.add(5);
			
			System.out.println();
			for(int i = 0; i < customer.getSize(); i++)
			{
				System.out.println(customer2.get(i));
			}
			
			
			
			//This loops spits out everything in the array
			for(int i = 0; i < customer.getSize(); i++)
			{
				System.out.println(customer2.get(i));
			}
			
			System.out.println();
			
			customer2.remove(2);
			customer2.remove(4);
			
			//This loops spits out everything in the array after the two additional method calls
			for(int i = 0; i < customer.getSize(); i++)
			{
				System.out.println(customer2.get(i));
			}
			
			
			
		}

	
}
