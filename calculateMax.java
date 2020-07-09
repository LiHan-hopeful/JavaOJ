public class Solution {
    /**
     * 计算你能获得的最大收益
     * 
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public int calculateMax(int[] prices) {
        int len = prices.length;
        int[] left = new int [len];
        left[0] = 0;
        int min = 0;
        for(int i =1; i < len; i++){
            if(prices[i] > prices[i - 1]){
                left[i] = Math.max(prices[i] - prices[min], left[i - 1]);
            }else{
                left[i] = left[i - 1];
                if(prices[i] < prices[min]){
                    min = i;
                }
            }
        }
        int[] right = new int [len];
        right[len - 1] = 0;
        int max = len - 1;
        for(int i = len -2; i >= 0; i--){
            if(prices[i] < prices[i + 1]){
                right[i] = Math.max(prices[max] - prices[i], right[i + 1]);
            }else{
                right[i] = right[i + 1];
                if(prices[max] < prices[i]){
                    max = i;
                }
            }
        }
        int result = 0;
        for(int i = 0; i < len; i++){
            result = Math.max(left[i] + right[i], result);
        }
        return result;
    }
}