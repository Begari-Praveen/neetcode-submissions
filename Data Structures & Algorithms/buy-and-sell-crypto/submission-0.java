class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;
        for(int i=1;i<prices.length;i++){
            int today_price = prices[i];
            if(today_price < min_price ){
                min_price = today_price;
            }
            else{
                int profit = today_price - min_price;
                max_profit = Math.max(profit , max_profit);
            }
        }
        return max_profit;
    }
}