//66. Plus One

package com.teddycoupon.practise;

import java.util.*;

public class plusOne {

	public static void main(String[] args) {
		int[] dig = {9,8,7,6,5,4,3,2,1,0}; 
		int[] l = plusOne(dig);
		for (int n : l) {
			System.out.print(n + " ");
		}
		
	}
	public static int[] plusOne(int[] digits) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0, carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
        	if (i == digits.length - 1) {
        		int num = digits[i] + 1 + carry;
        		carry = num / 10;
        		sum = num % 10;
        	}else {
        		int num = digits[i] + carry;
        		carry = num / 10;
        		sum = num % 10;
        	}
        	ans.add(sum);
        }
        if (carry > 0) {
            ans.add(carry);
        }
        int[] res = new int[ans.size()];
        int n = ans.size() - 1;
        for (int l : ans) {
        	res[n--] = l;  
        }
       return res; 
    }
}
