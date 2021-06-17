//55. Jump Game

package com.teddycoupon.practise;

public class jumpGame {

	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4};
		System.out.println(canJump(nums));
	}
	public static boolean canJump(int[] nums) {
        boolean ans = false;
        if (nums == null || nums.length == 0) return ans;
        int nxPo = 0, dist = 0, end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            dist = Math.max(dist, i + nums[i]);
            if (i == nxPo) {
               nxPo = dist;
                if (nxPo >= end)
                    ans = true;
                else if (i > nxPo) {
                    ans = false;  
                }else {
                    continue;
                }
            }
        }
        return ans;
    }
}
