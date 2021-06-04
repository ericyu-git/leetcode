//22. Generate Parentheses

   public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }
    public void backtrack(List<String> ans, String str, int left, int right, int n){

        if(str.length() == n * 2){
            ans.add(str);
            return;
        }
        
        if(left < n) 
            backtrack(ans, str+"(", left + 1, right, n);
        if(right < left)
            backtrack(ans, str+")", left, right + 1, n);
    }