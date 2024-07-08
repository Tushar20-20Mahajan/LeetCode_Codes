// class Solution {
//     public int minMoves(int[] nums) {
//         int maxNum = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>maxNum){
//                 maxNum=nums[i];
//             }
//         }
//         int sum =0;
//         for(int i=0;i<nums.length;i++){
//             sum+=maxNum-nums[i];
//         }
//         return sum;
        
//     }
// }

class Solution {
    public int minMoves(int[] nums) {
        // Find the minimum element in the array
        int minNum = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < minNum) {
                minNum = num;
            }
        }
        
        // Calculate the total number of moves required
        int moves = 0;
        for (int num : nums) {
            moves += num - minNum;
        }
        
        return moves;
    }
}
