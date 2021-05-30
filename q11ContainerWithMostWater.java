//11. Container With Most Water

  public int maxArea(int[] height){
        int res = 0, left = 0, right = height.length - 1;
        if(height.length == 0) return res;
        while(left < right){
            int wid = right - left;
            int hei = height[left] <= height[right]? height[left]:height[right];
            res = res > wid * hei? res:wid * hei;
            left = height[left] <= hei? left+1:left;
            right = height[right] <= hei? right-1:right;
            }
        return res;
    }