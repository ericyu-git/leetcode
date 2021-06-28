//81. Search in Rotated Sorted Array II

package com.leetcode.exers;

import java.util.Arrays;

public class searchInRotatedSortedArrayII {

	public static void main(String[] args) {
		int[] nums = {2,5,6,0,0,1,2};
		int tar = 6;
		System.out.println(search(nums, tar));
	}
    public static boolean search(int[] nums, int target) {
    	Arrays.sort(nums);
    	boolean res = false;
        if (nums.length == 1 && nums[0] == target) res = true; 
    	int start = 0, end = nums.length - 1;
    	while (start < end) {
    		int mid = (start + end) / 2;
    		if (nums[mid] == target || nums[start] == target || nums[end] == target) { 
    			res = true;
    			break;
    		} else if (nums[mid] > target) {
    			end = mid - 1; 
    		}else if (nums[mid] < target) {
    			start = mid + 1;
    		}
    		}
    	return res;
    }
}
