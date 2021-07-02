//1184. Distance Between Bus Stops

package com.leetcode.exers;

public class distanceBetweenBusStops {

	public static void main(String[] args) {
		int[] dist = {3,6,7,2,9,10,7,16,11};
		int s =	6;
		int des = 2;
		System.out.println(distanceBetweenBusStops(dist, s, des));
	}
	public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
	    if (start > destination) {
	    	int temp = start; 
	    	start = destination;
	    	destination = temp;
	    }
	    int cw = 0, total = 0;
	    for (int i = 0; i < distance.length; i++) {
	    	if (i >= start && i < destination) {
	    		cw += distance[i];
	    	}
	    	total += distance[i];
	    }
	return Math.min(cw, total - cw);    
	}
}
