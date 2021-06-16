//59. Spiral Matrix II
package com.leetcode.exers;

import java.util.Arrays;

public class spiralMatrixII {

	public static void main(String[] args) {
		int n = 3;
		int[][] l = generateMatrix(n);
		System.out.println(Arrays.deepToString(l));
	}
public static int[][] generateMatrix(int n) {
	        int rowBegin = 0, rowEnd = n - 1, colBegin = 0, colEnd = n - 1, i = 1;
	        int[][] ans = new int[n][n];
	        while (rowBegin <= rowEnd || colBegin <= colEnd) {
	           
                for (int a = colBegin; a <= colEnd; a++) {
	                ans[rowBegin][a] = i++;
	                }            
	            rowBegin++;
	           
                for (int b = rowBegin; b <= rowEnd; b++) {
	                ans[b][colEnd] = i++;
	            }
	            colEnd--;
	            if (rowBegin <= rowEnd) {
	           
                    for (int c = colEnd; c >= colBegin; c--) {
	                    ans[rowEnd][c] = i++;
	                }
	            }
	            rowEnd--;
	            if (colBegin <= colEnd) {
	          
                    for (int d = rowEnd; d >= rowBegin; d--) {
	                    ans[d][colBegin] = i++;
	                }
	            }
	            colBegin++;
	        }
	        return ans;
	    }