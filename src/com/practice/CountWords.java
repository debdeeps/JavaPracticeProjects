package com.practice;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {

				String str = "This this is is done by Saket Saket";
				String[] split = str.split(" ");
				HashMap<String,Integer> map = new HashMap<String,Integer>();
				//System.out.println(map.get("This"));
				for (int i=0; i<split.length; i++) {
					System.out.println(split[i]);
					if (map.containsKey(split[i])) {
						int count = map.get(split[i]);
						map.put(split[i], count+1);
					}
					else {
						map.put(split[i], 1);
					}
				}
				System.out.println(map);
	}

}
