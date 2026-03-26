package com.pac.array;
//Given an array of integers nums and an integer k,
//return the length of the longest subarray whose sum is equal to k.
//
//        🧾 Example:
//Input: nums = [1, 2, 3, -2, 5], k = 5
//Output: 2
//Explanation: [2,3] has sum = 5


import java.util.HashMap;

public class LongestSubArray {
    public static int lengthOfLongestSubarray(int[] nums, int k){
        int n = nums.length;
        int maxlength =0;
        int prefix_sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            prefix_sum+=nums[i];
            if (map.containsKey(prefix_sum-k)){
                int index = map.get(prefix_sum-k);
                maxlength= Math.max(maxlength,i-index);
            }
            map.putIfAbsent(prefix_sum,i);
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int[] nums={1, 2, 3, -2, 5};
        int k =5;
        System.out.println(lengthOfLongestSubarray(nums,k));
    }
}
