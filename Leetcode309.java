//leetcode 309 - best time to buy and sell stock with cooldown

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int n=prices.length;
        int[] buy=new int[n];
        int[] sell=new int[n];
        buy[0]=-prices[0];
        sell[0]=0;
        for(int i=1;i<n;i++){
            buy[i]=Math.max(buy[i-1],(i-2>=0?sell[i-2]:0)-prices[i]);
            sell[i]=Math.max(sell[i-1],buy[i-1]+prices[i]);
        }
        return sell[n-1];
    }
}