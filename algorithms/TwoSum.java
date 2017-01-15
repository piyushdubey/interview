/*
1. Two Sum   

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

UPDATE (2016/2/13):
The return format had been changed to zero-based indices. Please read the above updated description carefully.

*/

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int difference = 0;
        for(int i=0; i<nums.length; i++) {
            difference = target - nums[i];
            
            if(map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two elements add up to target sum.");
    }
    
    public static void main(String[] args) {
        TwoSum clazz = new TwoSum();
        
        int target1 = 21;
        int[] arr1 = new int[]{7, 0, 14};
        try {
            System.out.println(Arrays.toString(clazz.twoSum(arr1, target1)));    
        } catch(IllegalArgumentException iae) {
            iae.printStackTrace();
        }
        
        
    }
}