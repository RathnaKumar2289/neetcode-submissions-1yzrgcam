class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int maxProfit=0;
        int min=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[min]>maxProfit){
                maxProfit=prices[i]-prices[min];
            }else if(prices[i]<prices[min]){
                min =i;
            }
        }

        return maxProfit;
    }
}
