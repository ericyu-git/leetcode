//56. Merge Intervals

package com.leetcode.exers;

import java.util.*;

public class mergeIntervals {

	public static void main(String[] args) {
		int[][] inte = {{1,3},{2,6},{8,10},{15,18}};
		int[][] res = merge(inte);
		System.out.println(Arrays.deepToString(res));
	}
    public static int[][] merge(int[][] inte) {
        Arrays.sort(inte,(a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> temp = new ArrayList<>();
        int[] comp = inte[0];
        for (int i = 1; i < inte.length; i++) {
            if (inte[i][0] <= comp[1] && inte[i][1] <= comp[1]) {
                continue;
            }else if (inte[i][0] <= comp[1] && inte[i][1] > comp[1]) {
                comp[1] = inte[i][1];
            }else {
                temp.add(comp);
                comp = inte[i];
            }
        }
        temp.add(comp);
        int[][] ans = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
