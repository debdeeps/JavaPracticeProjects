package com.practice;
//Write a Java program than read an integer and calculate the sum of its digits and 
//write the number of each digit of the sum in English.
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
//		try {
			int sum = 0;
//			String str = br.readLine();
			char[] numStr = str.toCharArray();
			for (int i = 0; i < numStr.length; i ++) {
				System.out.println(numStr[i]);
				sum += Character.getNumericValue(numStr[i]) ;
			}
			System.out.println("Original Number: "+str);
			print_number(sum);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	public static void print_number(int n) {
		int x; int y; int z;
		String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		System.out.println("Sum of the digits of the said number: "+n);
		if (n < 10) {
			System.out.println(number[n]);
		}
		else if (n < 100) {
			x = n / 10;
			y = n - x *10;
			System.out.println("In English: "+number[x] + " " + number[y]);
		}
		else {
			x = n / 100;
			y = (n - x * 100) / 10;
			z = n - x * 100 - y * 10;
			System.out.println("In English: "+number[x] + " " + number[y] + " " + number[z]);
		}
		
	}
}
