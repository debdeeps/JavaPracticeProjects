package com.Testdome;


import java.util.Arrays;
import java.util.HashSet;


public class MergeNames {
    
 
	public static String[] uniqueNames(String[] names1, String[] names2) {
        HashSet<String> names = new HashSet<>(Arrays.asList(names1));
        names.addAll(Arrays.asList(names2));
        
        return names.toArray(new String[names.size()]);
        
    }

    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}


//public static String[] uniqueNames(String[] a, String[] b) {
////  throw new UnsupportedOperationException("Waiting to be implemented.");
//	ArrayList<String> l = new ArrayList<>();
//  for (int i = 0; i < (a.length > b.length ? a.length : b.length); i++) {
//      if (i < a.length) {
//          int c = 0;
//          while (c <= l.size()) {
//          	System.out.println(c+"	"+l.size());
//              if (l.contains(a[i]) == false) {
//                  l.add(a[i]);
//              }
//              c++;
//          }
//      }
//      if (i < b.length) {
//          int c = 0;
//          while (c <= l.size()) {
//              if (l.contains(b[i]) == false) {
//                  l.add(b[i]);
//              }
//              c++;
//          }
//
//      }
//  }
////  String[] names=l.toArray();
//String[]  names= l.toArray(new String[l.size()]);  
//  return names;
//}