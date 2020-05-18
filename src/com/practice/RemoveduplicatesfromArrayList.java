package com.practice;
//Java program to remove duplicates from ArrayList 
//https://www.geeksforgeeks.org/how-to-remove-duplicates-from-arraylist-in-java/
import java.util.*; 

public class RemoveduplicatesfromArrayList { 

	// Function to remove duplicates from an ArrayList 
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) 
	{ 

		// Create a new ArrayList 
		ArrayList<Integer> newList = new ArrayList<>(); 

		// Traverse through the first list 
		for (Integer element : list) { 

			// If this element is not present in newList 
			// then add it 
			if (!newList.contains(element)) { 

				newList.add(element); 
			} 
		} 

		// return the new list 
		return newList; 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 

		// Get the ArrayList with duplicate values 
		ArrayList<Integer> list = new ArrayList<>( 
				Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 

//		ArrayList<Integer> list = new ArrayList<Integer> ();
//		list.add(1);
//		list.add(10);
//		list.add(1);
//		list.add(2);
//		list.add(2);
//		list.add(3);
//		list.add(3);
		
		
		
		// Print the Arraylist 
		System.out.println("ArrayList with duplicates: "
						+ list); 

		// Remove duplicates 
		ArrayList<Integer> newList = removeDuplicates(list); 

		// Print the ArrayList with duplicates removed 
		System.out.println("ArrayList with duplicates removed: "
						+ newList); 
	} 
} 
