class Solution { 

    public int searchInsert(int[] nums, int target) { 

    int start = 0, end = nums.length -1; 

    if(target == 0 || target < nums[0]) return 0; 

    if(target > nums[end]) return end + 1; 

    while (start <= end){ 

        int mid = (start + end) / 2; 

        if(nums[mid] == target) return mid; 

        else if(target < nums[mid])  

                end = mid - 1; 

        else    start = mid + 1; 

    } 

        return start; 

    } 

} 