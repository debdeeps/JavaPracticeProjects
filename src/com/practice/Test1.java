package com.practice;

import java.util.*;
//import java.util.LinkedList;

//Write a Java program to find the number of even and odd integers in a given array of integers.
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 7, 2, 4, 9};
		int evencount = 0;
		int oddcount = 0;
		LinkedList <Integer> ll= new LinkedList <Integer> ();
		ArrayList <Integer> al=new ArrayList <Integer> ();
		HashMap <Integer,Integer> hp = new HashMap <Integer,Integer>();
		HashSet <Integer> hs= new HashSet <Integer> ();
		
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				evencount++;
			else
				oddcount++;

		}
		System.out.println("Number of evens" + evencount + "\n" + "Number of odds" + oddcount);
	}

}
