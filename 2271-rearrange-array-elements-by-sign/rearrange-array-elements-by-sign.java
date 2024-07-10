
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int[] positive = new int[(nums.length + 1) / 2];
//         int[] negative = new int[(nums.length + 1) / 2];
//         int x = 0;
//         int y = 0;

//         // Separate positive and negative numbers
//         for (int i : nums) {
//             if (i < 0) {
//                 negative[y++] = i;
//             } else {
//                 positive[x++] = i;
//             }
//         }

//         x = 0;
//         y = 0;

//         // Merge positive and negative numbers back into nums array alternately
//         for (int i = 0; i < nums.length; i += 2) {
//             nums[i] = positive[x++];
//             if (i + 1 < nums.length) {
//                 nums[i + 1] = negative[y++];
//             }
//         }

//         return nums;
//     }
// }

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] arr = new int[nums.length];
        int i=0;
        int j =1;
        for(int k:nums){
            if(k>0){
                arr[i]=k;
                i=i+2;
            }else{
                arr[j]=k;
                j=j+2;
            }
        }
        return arr;
    }
}