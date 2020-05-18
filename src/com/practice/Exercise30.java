package com.practice;
//Write a Java program to check if an array of integers without 0 and -1.
import java.util.*; 
import java.io.*; 
 public class Exercise30 {
 public static void main(String[] args)
 {
    int[] array_nums = {-1, 77, 12, 54, -11};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	System.out.println("Result: "+test(array_nums));
    }	
    public static boolean test(int[] numbers) {
    for (int number : numbers) {
      if (number == 0 || number == -1) {
        return false;
      }
    }
    return true;
  }  
}
