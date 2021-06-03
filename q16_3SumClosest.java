//16. 3Sum Closest

   public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
    	int res = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i =0; i < nums.length - 2; i++){
            int lo = i + 1, hi = nums.length - 1;
            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(Math.abs(target - res) > Math.abs(target - sum)){
                    res = sum;
                }
               if(sum > target) hi--;
               else lo++;
            }
        }
       return res;
   }