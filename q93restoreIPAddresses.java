//93. Restore IP Addresses

package com.leetcode.exers;

import java.util.*;

public class restoreIP_Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0000";
		List<String> res =  restoreIpAddresses(s);
		for (String l : res) {
		System.out.print(l + " | ");
		}
	}
	public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                for (int c = 1; c <= 3; c++) {
                    for (int d = 1; d <= 3; d++) {
                        if (a + b + c + d == s.length()) {
            				int A = Integer.parseInt(s.substring(0, a));
                            int B = Integer.parseInt(s.substring(a, a+b));
                            int C = Integer.parseInt(s.substring(a+b, a+b+c));
                            int D = Integer.parseInt(s.substring(a+b+c));
                            if (A <= 255 && B <= 255 && C <= 255 && D <= 255) {
                                sb.append(A).append('.').append(B).append('.').append(C).append('.').append(D);
                                if (sb.length() == s.length() + 3) res.add(sb.toString());
                                sb.delete(0, sb.length());                            
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
