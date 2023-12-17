public class StockBuyAndSellTime {
    public static void main(String[] args) {
        int[] prices = new int[] { 8, 3, 5, 3, 7, 2, 6 , 1}; // [7,6,4,3,1]
        System.out.println("Maximum profit is " + maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return -1;
        }
        int start = 0; 
        int end = 1;
        int max_profit = 0;
        while (end < prices.length) {
            // System.out.println(end);
            if (prices[end] <= prices[start]) {
                start = end;
            } else {
                int curr_profit = prices[end] - prices[start];
                max_profit = Math.max(max_profit, curr_profit);
            }
            end++;
        }
        return max_profit;

    }
}
