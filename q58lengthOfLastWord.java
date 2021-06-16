//58. Length of Last Word

    public int lengthOfLastWord(String s) {
    int ans = 0;
    String ss = s.trim();
    if (s == null || s.length() == 0) return ans;
    for(int i = ss.length() - 1; i >= 0; i--) {
        if (ss.charAt(i) == ' ') {
            return ans;
        }else {
            ans++;
        }
    }
        return ans;
    }