1. Two Sum 

class Solution { 

    public int[] twoSum(int[] nums, int target) { 

        int[] number= new int[2]; 

    label: for (int i=0;i<nums.length-1;i++){ 

            for (int j=i+1;j<=nums.length;j++){ 

                if(nums[i]+nums[j]==target){ 

                   number[0]=i; 

                   number[1]=j; 

                    break label; 

                } 

            } 

        } 

        return number; 

    } 

} 