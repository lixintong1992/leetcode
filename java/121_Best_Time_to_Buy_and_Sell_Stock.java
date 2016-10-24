public class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, earn = 0;
        for (int i : prices){
            if (i < buy) buy = i;
            earn = Math.max(earn, i - buy);
        }
        return earn;
    }
}

public class Solution {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}