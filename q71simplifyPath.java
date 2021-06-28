//71. Simplify Path

package com.leetcode.exers;

import java.util.Stack;

public class simplifyPath {

	public static void main(String[] args) {
		String path = "/../";
		System.out.println(simplifyPath(path));
	}
public static String simplifyPath(String path) {
	        StringBuilder sb = new StringBuilder();
	        Stack<String> st = new Stack<String>();
	        String[] temp = path.split("/");
	        for (int i = 0; i < temp.length; i++) {
	        	if (temp[i].isEmpty()) {
	        		continue;
	        	}
	        	if (temp[i].equals(".")) {
	        		continue;
	        	}
	        	if (temp[i].equals("..")) {
	        		if (!st.empty()) {
	        		while (st.lastElement() != "/") {
	        			st.pop();
	        		}
	        		st.pop();
	        		continue;
	        		} else {
	        			continue;
	        		}
	        	}
	        	st.push("/");
	        	st.push(temp[i]);
	        }
	        while (!st.isEmpty()) {
	        	sb.insert(0, st.pop());
	        }
	        if (sb.length() == 0) 
	            sb.append("/");
	        return sb.toString(); 
	  }