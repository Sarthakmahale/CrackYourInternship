class bestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int bp = prices[0];
        int p = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < bp) {
                bp = prices[i];
            } else {
                int cp = prices[i] - bp;
                p = Math.max(cp, p);
            }
        }
        return p;
    }

    public static void main(String args[]) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        bestTimeToBuyAndSellStock s = new bestTimeToBuyAndSellStock();

        int maxProfit = s.maxProfit(prices);

        System.out.println("Maximum profit: " + maxProfit);
    }
}