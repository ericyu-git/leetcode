//9. Palindrome Number
    public boolean isPalindrome(int x) {
    boolean res = true;
    String temp = Integer.toString(x);
    int left = 0, right = temp.length() - 1;
    if(temp == null || x < 0) return false;
    while(left < right){
        if(temp.charAt(left) != temp.charAt(right)){
            return false;
        }else{
            left++;
            right--;
        }
    }
        return res;
    }