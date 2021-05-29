//46. Permutations

 public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        List<Integer> bit = new ArrayList<Integer>();
        bit.add(nums[0]);
        ans.add(bit);
        for(int i = 1; i < nums.length; i++){
            List<List<Integer>> temp = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                for(List<Integer> dumm : ans){
                    List<Integer> ins = new ArrayList<Integer>(dumm);
                    ins.add(j, nums[i]);
                    temp.add(ins);
                }
            }
            ans = temp;
        }
        return ans;
    }