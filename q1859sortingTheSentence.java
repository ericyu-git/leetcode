//1859. Sorting the Sentence

package com.leetcode.exers;

public class sortingTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
	}
	public static String sortSentence(String s) {
	    StringBuilder sb = new StringBuilder();
	    int part = 1, ind = 0;
	    while (s.contains(String.valueOf(part))) {
	        ind = s.indexOf(String.valueOf(part));
	        while (s.charAt(ind) != ' ' && ind > 0) {
	            ind--;
	        }
	        if (ind == 0) {
	        	ind--;
	        }
	        sb.append(s.substring(ind + 1, s.indexOf(String.valueOf(part)))).append(" ");
	        part++;
	    }
        sb.deleteCharAt(sb.length() - 1);
	    return sb.toString();
	    }
}
