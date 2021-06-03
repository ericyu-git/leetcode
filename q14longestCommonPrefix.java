//14. Longest Common Prefix

  public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        if (strs.length == 0 || strs == null) return ans;
         for(int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(ans) != 0){
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        return ans;
    }