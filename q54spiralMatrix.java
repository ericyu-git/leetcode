//54. Spiral Matrix

package com.teddycoupon.practise;

import java.util.*;

public class spiralMatrix {

	public static void main(String[] args) {
		int[][] ma = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		List<Integer> t = spiralOrder(ma);
			for (int ll : t) {
				System.out.print("["+ll+"] ");
		}
	}
	public static List<Integer> spiralOrder(int[][] ma) {
        List<Integer> ans = new ArrayList<>();
        int minI = 0, minJ = 0, lenI = ma.length - 1, lenJ = ma[0].length - 1;

        while (minI <= lenI && minJ <= lenJ) {
                for (int i = minJ;i <= lenJ; i++) {
                    ans.add(ma[minI][i]);
                }
                minI++;
                for (int i = minI; i <= lenI; i++){
                    ans.add(ma[i][lenJ]);
                }
                lenJ--;
                if (minI <= lenI) {
                    for (int i = lenJ; i >= minJ ; i--) {
                        ans.add(ma[lenI][i]);
                    }
                }
                lenI--;
                if (minJ <= lenJ) {
                    for (int i = lenI; i >= minI; i--) {
                        ans.add(ma[i][minJ]);
                    }
                }
                minJ++;
            }
        return ans;
    }
}
