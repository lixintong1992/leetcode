public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++){
            result -= (prices[i - 1] - prices[i] < 0) ? prices[i - 1] - prices[i] : 0;
        }
        return result;
    }
}