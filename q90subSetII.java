//90. Subset II

package com.leetcode.exers;

import java.util.*;

public class subSetII {

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		List<List<Integer>> res = subsetsWithDup(nums);
		for (List<Integer> l : res) 
			System.out.print(l + " ");
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null) return ans;
        Arrays.sort(nums);
        ss(nums, ans, new ArrayList<Integer>(), 0);
        return ans;    
    }
    public static void ss(int[] nums, List<List<Integer>> ans, List<Integer> hs, int start) {
        ans.add(new ArrayList<Integer>(hs));
       
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue;
            hs.add(nums[i]);
            ss(nums, ans, hs, i + 1);
            hs.remove(hs.size() - 1);
        }
    }
}
