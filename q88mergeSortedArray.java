//88. Merge Sorted Array

package com.teddycoupon.practise;

public class mergeSortedArray {

	public static void main(String[] args) {
		int[] n1 = {4,5,6,0,0,0};
		int[] n2 = new int[]{1,2,3};
		int m = 3;
		int n = 3;
		merge(n1, m, n2, n);
		for (int l : n1)
		System.out.print(l +" ");
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int j = 0;
        if (n == 0 && m > 0) return;
        if (m == 0 && n > 0) {            
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[j++];
            }
            return;
        }
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j++];
        }
        for (int i = m + n - 1; i > 0; i--) {
        	for (int k = 0; k < i; k++)
        		if (nums1[k] > nums1[k + 1]) {
        			int temp = nums1[k];
        			nums1[k] = nums1[k + 1];
        			nums1[k + 1] = temp;
            }
        }
    }
}
