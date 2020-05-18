package com.codility;




public class Frog{
	public static int numberOfCombinations(int distance) {
	    if (distance == 1) {
	        return 1; //step
	    } else if (distance == 2) {
	        return 2; // (step + step) or jump
	    } else {
	        return numberOfCombinations(distance - 1) + numberOfCombinations(distance - 2); 
	       // we jumped or stepped into the current field
	    }
	}

public static void main(String[] args) {
    System.out.println(numberOfCombinations(3));
 }
}