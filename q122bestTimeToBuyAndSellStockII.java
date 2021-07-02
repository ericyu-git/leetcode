//122 Best Time to Buy and Sell Stock II

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, lowPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > lowPrice) {                
                    max += prices[i] - lowPrice;
                    lowPrice = prices[i];                
            } else 
                lowPrice = prices[i];
        }
    return max;
    }
}