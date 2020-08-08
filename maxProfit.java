class Solution {
    public int maxProfit(int[] prices) {
        int ret = 0;
        for(int i = 1; i < prices.length; ++i)
       {
            int curProfit = prices[i] - prices[i - 1];
            if(curProfit > 0)
                ret += curProfit;
       }
        return ret;
   }
}
