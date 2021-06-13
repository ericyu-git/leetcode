//48. Rotate Image

package com.teddycoupon.practise;

public class rotate {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotates(matrix);
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
			System.out.print(matrix[i][j]+",");
			}
			System.out.println();
		}
	}
	public static void rotates(int[][] matrix) {
        int len = matrix.length - 1;
        for (int i = 0; i <= len / 2; i++) {
            for (int j = i; j <= len -1 -i; j++) {
            if (i == j)
                swap0(matrix, i, j, len - i, len - j);
            else
            	swap(matrix, i, j, len - i, len - j);
            }
        }
    }
    private static void swap0(int[][] ma, int i, int j, int x, int y) {
        int temp = ma[i][j];
        ma[i][j] = ma[x][j];
        ma[x][j] = ma[x][y];
        ma[x][y] = ma[i][y];
        ma[i][y] = temp;
    }
    private static void swap(int[][] ma, int i, int j, int x, int y){
        int temp = ma[i][j];
        ma[i][j] = ma[y][i];
        ma[y][i] = ma[x][y];
        ma[x][y] = ma[j][x];
        ma[j][x] = temp;
    }
}

