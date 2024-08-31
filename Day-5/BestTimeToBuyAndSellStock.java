class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i : prices) {
            if (i < min_price) {
                min_price = i;
            }
            int profit = i - min_price;
            if (profit > max_profit) {
                max_profit = profit;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}