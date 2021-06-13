//49. Group Anagrams

package com.leetcode.exers;
import java.util.*;
public class groupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> l = groupAna(strs);
		for (List<String> s : l)
			System.out.print(s+" ");
	}
	private static List<List<String>> groupAna(String[] str) {
		if (str == null || str.length == 0) return new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (String s : str) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String keyStr = String.valueOf(c);
			if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
			map.get(keyStr).add(s);
		}
		return new ArrayList<>(map.values());
	}
}
