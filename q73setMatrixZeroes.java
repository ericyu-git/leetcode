//Set Matrix Zeroes

package com.leetcode.exers;

import java.util.Arrays;

public class setMatrixZeroes {

	public static void main(String[] args) {
		int[][] ma = {{3,7,2,8,2},{2,2,4,1,8},{0,5,7,6,3},{8,1,0,7,7},{1,3,7,4,1},{6,5,5,6,3},{7,1,0,1,9},{5,4,4,9,7},{2,2,4,1,0},{7,1,1,9,1},{8,0,4,7,6},{7,5,1,2,3},{7,2,5,9,3}};   //{{1,1,1},{1,0,1},{1,1,1}};
		System.out.println(Arrays.deepToString(ma));
	}
	public void setZeroes(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) 
                    continue;
                else {
                    sb.append(i);
                    sb.append(j);
                }
            }
        }
        for (int k = 0, l = 1; k < sb.length() -1; k += 2, l += 2) {
            int n = Character.getNumericValue(sb.charAt(k));
            int m = Character.getNumericValue(sb.charAt(l));
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[i][m] = 0;
                matrix[n][i] = 0;
            }
        }
    }
}
