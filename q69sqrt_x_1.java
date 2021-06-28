//69. sqrt(x)

package com.teddycoupon.practise;

public class sqrt_x {

	public static void main(String[] args) {
		int x = 2147395600;
		System.out.println(mySqrt(x));
	}
	 public static int mySqrt(int x) {
		    int ans = 0;
		    for (int i = x / 2 + 1; i >= 0; i--) {
		        if (Math.pow(i, 2) <= x) {
		        	ans = Integer.valueOf(i);
		        	break;
//		        }else if (Math.pow(i, 2) == x) {
//		        	ans = i;
//		        	break;
		        }else continue;
		    }
		    return ans;
		    }
}
