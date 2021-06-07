//34. Find First and Last Position of Element in Sorted Array

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        if(nums == null || nums.length == 0) return ans;
        int i = 0, j = nums.length - 1;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == target) {
                ans[0] = i;
                break;}
        }
        for(j = nums.length -1; j >= i; j--){
            if(nums[j] == target) {
                ans[1] = j;
                break;}
        }
        return ans;
    }