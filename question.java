import java.util.Arrays;

public class mergeIntervals {

	public static void main(String[] args) {
		int[][] inte = {{1,3},{2,6},{8,10},{11,15}};
		int[][] res = merge(inte);
			System.out.print(Arrays.deepToString(res));
	}
	public static int[][] merge(int[][] inte) {
        int[][] ans = new int[][]{};
        int[] temp = inte[0];
        int n = 0;
        for (int i = 1; i < inte.length; i++) {
           if (temp[1]  >= inte[i][0]) {
        	   temp[1] = inte[i][1];
        	   
           }else {
        	   ans[n] = temp;
        	   n++;
        	   temp = inte[i];
           }
        }
        return ans;
    }
}
