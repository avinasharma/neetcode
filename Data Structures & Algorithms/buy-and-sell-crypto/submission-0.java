class Solution {
    public int maxProfit(int[] prices) {
    int left = 0, right = 1;
    int maxProfit = 0;

    while (right < prices.length) {
        if (prices[right] > prices[left]) {
            maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
        } else {
            left = right;  // found cheaper price, shift buy day
        }
        right++;
    }
    return maxProfit;
}
}
