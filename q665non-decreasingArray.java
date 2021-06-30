//665. Non-decreasing Array

package com.leetcode.exers;

public class non_decreasingArray {

	public static void main(String[] args) {
		int[] n = {5, 7, 3, 8};
		System.out.println(checkPossibility(n));
	}
		    
		public static boolean checkPossibility(int[] nums) {
		    int cnt = 0; 
	        for (int i = 1; i < nums.length && cnt <= 1; i++) {
	            if (nums[i - 1] > nums[i]) {
	                cnt++;
	                if (i - 2 < 0 || nums[i - 2] <= nums[i]) nums[i - 1] = nums[i];
	                else nums[i] = nums[i - 1];
	            }
	        }
	        return cnt <= 1;
	    }
}
