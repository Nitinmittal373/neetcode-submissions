class Solution {
    public int maxProfit(int[] prices) {
        int mibu=prices[0];
        int profit=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            mibu=Math.min(mibu,prices[i-1]);
            profit=Math.max(profit,prices[i]-mibu);
        }
        if(profit<0){
            return 0;
        }
        return profit;
    }
}
