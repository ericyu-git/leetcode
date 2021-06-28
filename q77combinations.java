//77. Combinations

package com.teddycoupon.practise;

import java.util.*;

public class combination {

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		List<List<Integer>> l = combine(n, k);
		for (List<Integer> ll : l)
			System.out.print(ll+" ");
	}
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        ans = comb(ans, new ArrayList<>(), n, k, 1);
        return ans;
    }
    public static List<List<Integer>> comb(List<List<Integer>> ans, List<Integer> temp, int n, int k, int start) {
        if (k == 0) {
            ans.add(new ArrayList<>(temp));
        }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            comb(ans, temp, n, k - 1, i + 1);
            temp.remove(temp.size() - 1);
        }
        return ans;
    }
}
