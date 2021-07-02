//121. Best Time to Buy and Sell Stock

public static int maxProfit(int[] prices) {
        int ans=0, lowPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowPrice) {
                lowPrice = prices[i];
            } else 
                ans = Math.max(ans, prices[i] - lowPrice);
        }
     return ans;
    }
