package com.practice.testdome;

public class Palindrome {
    public static boolean isPalindrome(String word) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
//    	Character.toLowerCase(word);
    int len=word.length();
    for (int i=0; i<len;i++) {
    	if (Character.toLowerCase(word.charAt(i))!=Character.toLowerCase(word.charAt(len-i-1)))
    		return false;
    }
	return true;
    }
    			
    		
    		
    		
    			
    	
//    	int j=0;
//   	boolean pali=true;
//    	int len=word.length();
//    	char [] wordarr= new char [len];
//    	char [] wordarr1= new char [len];
//    	wordarr=word.toCharArray();
//    	for (;j<len;j++) {
//    		wordarr1[j]=Character.toLowerCase(wordarr[j]);
//    		System.out.println(wordarr[j]);
//    	}
//    	wordarr=word.toCharArray();
//    	for (int i=0;i<word.length();i++) {
//    		if (wordarr1[i]==wordarr1[len-i-1])
//    			pali=true;
//    		else
//    			pali=false;
//    				
//    	}
//		return pali;
//    	
//    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
