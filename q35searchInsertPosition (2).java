//35. Search Insert Position

 public int searchInsert(int[] nums, int target) {
        int idx = 0;
    for(int i = 0, j = nums.length-1; i <= j; i++, j--){
        if(nums[i] == target) return i;
        if(nums[j] == target) return j;
        if(nums[i] > target) return i;
        if(nums[j] < target) return j+1;
        idx = j;
    }
        return idx;
    }