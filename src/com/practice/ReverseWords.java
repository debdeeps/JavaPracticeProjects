package com.practice;

import java.util.*;
public class ReverseWords {
 public static String WordsInReverse(String str1) {
	 Stack <String> st = new Stack <String> ();
	 String [] strSplit =str1.split(" ");
	 for (String i : strSplit) st.push(i);
	 String [] strRev = new String [strSplit.length];
	 for (int i=0;i<strSplit.length;i++)
	 strRev[i]=st.pop();
	 String sb = "";

	 for (int i=0;i<strSplit.length;i++)
		 sb=sb+" "+strRev[i];

	 return sb.toString().trim();

 }

 public static void main(String[] args) {
  String str1 = "Reverse words in a given string";
  System.out.println("The given string is: " + str1);
  System.out.println("The new string after reversed the words: " + WordsInReverse(str1));
 }
}
