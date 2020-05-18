package com.Testdome;

import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
    	int ar[] = new int[2];
     
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
            	System.out.println(map.get(nums[i]));
                return new int[]{map.get(nums[i]), i};
                
            }else{
                map.put(target-nums[i], i);
            }
        }
     
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
