// class Solution {
//     public int maxProfit(int[] prices) {
//         int buy = Integer.MAX_VALUE;
//         int sell = Integer.MIN_VALUE;
//         int lp = 0;
//         int rp = prices.length;
//         int max = Integer.MIN_VALUE;
//         while(lp<rp){
//             if((prices[rp]-prices[lp])>max){
//                 max = prices[rp]-prices[lp];
//             }

//         }
//         return max;;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            // Update the minimum price encountered so far
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate the profit if we sell at the current price
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        
        return maxProfit;
    }
}
