class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int sellingPrice : prices){
               minPrice = Math.min(minPrice,sellingPrice);
               int profit = sellingPrice - minPrice;
               if(profit>maxProfit){
                maxProfit = profit;
               }
        }
        return maxProfit;
    }
}
