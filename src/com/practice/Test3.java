package com.practice;

import java.util.Scanner;

public class Test3 {
    public static boolean isPalindrome(String word) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    	
    	
    	
    	String reverse = "";
		boolean pali;
		word=word.toLowerCase();
		int length = word.length();
	
		for (int i =length -1; i>=0; i--) {
			reverse = reverse + word.charAt(i);
		}
//		System.out.println("reverse is:" +reverse);
		
		if(word.equals(reverse)) 
			pali=true;
		else
			pali=false;
    	return pali;
    	
    	
    	
    	
    	
    }
    
    public static void main(String[] args) {
        System.out.println(Test3.isPalindrome("Deleveled"));
    }
}