//75. Sort Colors

package com.leetcode.exers;

public class sortColors {

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for (int l : nums)
		System.out.print(l + " ");
		
	}
	public static void sortColors(int[] nums) {
        if (nums.length == 1) return;
        int len = nums.length - 1;
        for (int k = len; k >= 0; k--) {
            for (int i = 0, j = i + 1; i < len; i++, j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
