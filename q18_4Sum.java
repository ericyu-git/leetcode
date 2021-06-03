//18. 4Sum

public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length <= 3 || nums == null) return ans;
        for(int i = 0; i < nums.length - 2; i++){
        	for(int j = i + 1; j < nums.length - 1; j++){
        		int lo = j + 1, hi = nums.length - 1, sum = 0;
        		while(lo < hi){
        			sum = nums[i] + nums[j] + nums[lo] + nums[hi];
        			if(sum == target){
        				List<Integer> temp = new ArrayList<>();
        				 temp.add(nums[i]);
                         temp.add(nums[j]);
                         temp.add(nums[lo]);
                         temp.add(nums[hi]);
                        if(!ans.contains(temp)) ans.add(temp);
        			}
        				if(sum < target) lo++;
                        else hi--;
        			}
        		}
        	}
        
        return ans;
    }