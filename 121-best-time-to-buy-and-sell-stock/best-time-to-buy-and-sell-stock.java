
// class Solution {
//     public int maxProfit(int[] prices) {
//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
        
//         for (int price : prices) {
//             // Update the minimum price encountered so far
//             if (price < minPrice) {
//                 minPrice = price;
//             }
//             // Calculate the profit if we sell at the current price
//             else if (price - minPrice > maxProfit) {
//                 maxProfit = price - minPrice;
//             }
//         }
        
//         return maxProfit;
//     }
// }



class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minValue){
                minValue=prices[i];
            }
            else if (prices[i]-minValue > maxProfit){
                maxProfit = prices[i]-minValue;
            }
        }
        return maxProfit;
    }
}