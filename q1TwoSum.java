// 1. Two Sum

    public int[] twoSum(int[] nums, int target) { 

        int[] ans= new int[2];

        for (int i=0; i<nums.length-1; i++){

            for (int j=i+1; j<nums.length; j++){

                if(nums[i]+nums[j]==target){ 

                   number[0]=i; 

                   number[1]=j; 

                    break;

                } 

            } 

        } 
        return ans;
    }
