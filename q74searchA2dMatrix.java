//74. Search a 2D Matrix

package com.leetcode.exers;

public class searchA2DMatrix {

	public static void main(String[] args) {
		int[][] ma = {{1},{3}};//{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int tar = 3;
		System.out.println(searchMatrix(ma, tar));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        if (row != 0) {
            if (target < matrix[0][0]) { return ans; }
            for (int i = row; i >= 0; i--) {
                if (target >= matrix[i][0]) {
                    row = i;
                    break;
                }
            }
        } else {
            row = 0;
        }
        int lo = 0;
        while (lo <= col) {
            if (matrix[row][lo] == target || matrix[row][col] == target) {
                ans = true;
                break;
            }
            lo++;
            col--;
        }
        return ans;
    }
}
