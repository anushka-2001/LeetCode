class Solution {
    public int maxProfit(int[] prices) {
        int max[] = new int[prices.length];
         max[prices.length-1]= prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            max[i]= Math.max(max[i+1],prices[i]);
            
        }
             int profit=0;
             
             for(int i=0; i<prices.length;i++){
                 profit= Math.max(max[i]-prices[i], profit);
             }
             
             return profit;
    }
}