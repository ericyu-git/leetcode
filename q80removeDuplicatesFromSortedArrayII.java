//80. Remove Duplicates from Sorted Array II

public int removeDuplicates(int[] nums) {
        int i = 0, n = 1, temp = -1, ans = 0;
        while (i < nums.length) {
            n = nums[i] != temp ? 1 : n;
            temp = nums[i] != temp ? nums[i] : temp;
            if (nums[i] == temp && n <= 2) {
                i++;
                n++;
                continue;
            } else if (nums[i] == temp && n > 2) {
                nums[i] = Integer.MAX_VALUE;
                i++;
                n++;
                continue;
            }
        }
        Arrays.sort(nums);
        for (int t : nums)
            if (t < Integer.MAX_VALUE) 
                ans++;
        return ans;
    }
