package com.practice;

/* Basic Java program that reverses an array*/

public class ReverseArray { 

	/* function that reverses array and stores it 
	in another array*/
	static void reverse(int[] a) 
	{ 
		int n=a.length;
		int[] b = new int[n]; 
		int j = n; 
		for (int i = 0; i < n; i++,j--) { 
			b[j - 1] = a[i]; 
//			j = j - 1; 
		} 

		/*printing the reversed array*/
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(b[k]); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr); 
	} 
} 
