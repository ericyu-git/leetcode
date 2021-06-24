//231. Power Of Two

package com.leetcode.exers;

public class powerOf2 {

	public static void main(String[] args) {
		int n = 11;
		System.out.println(isPowerOfTwo(n));
	}
	  public static boolean isPowerOfTwo(int n) {
	        return cal(n, 0);
	    }
	    public static boolean cal(int n, int start) {
	        if (n == Math.pow(2, start)) return true;
	        else if (n < Math.pow(2, start)) return false;
	        else return cal(n, start + 1);
	    }
}
