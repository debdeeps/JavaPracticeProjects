package com.practice;
// Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		int[] array = { 20, 20, 30, 40, 50, 50, 50 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != array[j] && !al.contains(array[i]))
					al.add(array[i]);

			}
		}
		System.out.println(al);
	}

}
