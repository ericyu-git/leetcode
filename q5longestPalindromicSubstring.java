//Given a string s, return the longest palindromic substring in s.
//
// 
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
//Example 2:
//
//Input: s = "cbbd"
//Output: "bb"
//Example 3:
//
//Input: s = "a"
//Output: "a"
//Example 4:
//
//Input: s = "ac"
//Output: "a"
class Solution {
    int maxlen = 0, hi = 0, lo = 0;
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        String res = "";
        int max = 0;
        for(int i = 0; i < s.length() - 1; i++){
            cal(s, i, i);
            cal(s, i, i + 1);
            if (max < maxlen){
                max = maxlen;
                res = s.substring(lo, hi);
            }
        }
        return res;
    }
    public void cal(String s, int i, int j){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        if(maxlen < j - i - 1){
            maxlen = j - i - 1;
            hi = j;
            lo = i + 1;
        }
    }
}