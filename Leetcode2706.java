//leetcode 2706 - buy two chocolates
class Solution {
    public int buyChoco(int[] prices,int money){
        Arrays.sort(prices);
        int cost=prices[0]+prices[1];
        if(cost<=money){
            money-=cost;
        }       
        return money;
    }
}