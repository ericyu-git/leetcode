//53. Maximum Subarray

public class subArray {

public static void main(String[] args) {
		int[] nums = {-1, -2};
		System.out.println(maxSubArray(nums));
	}
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        if (nums.length == 1) return nums[0];
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
                int j = i + 1;
                ans = Math.max(ans, temp); 
                while (j < nums.length) {
                    temp += nums[j++];
                    ans = Math.max(ans, temp);               
                }
            }
        return ans;
    }
}
