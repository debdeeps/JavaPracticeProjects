package com.practice.testdome;
import java.util.Arrays;
import java.util.HashSet;

public class MergeNames {
    
    public static int [] uniqueNames(int[] names1, int[] names2) {

    	HashSet <Integer> hs=new HashSet <Integer> ();
    	for (int str : names1)
    	hs.add(str);
    	for (int str : names2)
        	hs.add(str);
//    	int[] primitive = ArrayUtils.toPrimitive(hs.toArray(new Integer[0]));
    	int[] primitive = hs.stream()
				.mapToInt(Integer::intValue)
				.toArray();

//		System.out.println();

		return primitive;
    }
    
    public static void main(String[] args) {
    	 int[] a = { 1, 2, 2, 3, 1, 5, 3 };
         int[] b = { 4, 3, 1, 5, 7, 8, 4, 2 };
    	int [] c = new int [50];
    	c=MergeNames.uniqueNames(a, b);
    	for (int i:c) System.out.println(i);
//        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
//        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(); // should print Ava, Emma, Olivia, Sophia
    }
}